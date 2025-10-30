package org.superautomachines.ui;

import org.superautomachines.commands.*;
import org.superautomachines.commands.Args.BuyTeamPlayerArgs;
import org.superautomachines.commands.Args.CommandArgs;
import org.superautomachines.commands.Args.CommandResponse;
import org.superautomachines.commands.Args.FightCommandResponse;
import org.superautomachines.game.Market;
import org.superautomachines.game.Match;
import org.superautomachines.game.Round;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Interaction {
    private final Pattern regex = Pattern.compile("\\D");
    private ICommand command;
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        Panels.menu();
        int option = getInput();
        switch (option) {
            case 1 -> {
                startMatch();
                play();
            }
        }
    }

    public void startMatch() {
        command = new NewMatch();
        command.execute(CommandArgs.argsInstance);
    }

    public void play() {
        while (true) {
            playRound();
            if (Match.getCurrent().getLife() == 0) {
                Panels.gameOver();
                Util.wait(3.0);
                break;
            }
        }
    }

    public void playRound() {
        command = new NewRound();
        command.execute(CommandArgs.argsInstance);

        pickPlayers();

        Panels.introduceFight();

        command = new PlayFight();

        while (true) {
            FightCommandResponse result = (FightCommandResponse) command.execute(null);

            System.out.println(result.getPlayer().getName().toUpperCase() + " against " + result.getOpponent().getName().toUpperCase());
            System.out.println();
            Util.wait(1.2);
            System.out.println(result.getWinner().getName().toUpperCase() + " WON!");
            Util.wait(1.0);

            if (Round.getCurrent().getOpponents().isEmpty()) {
                Match.getCurrent().setTrophies(Match.getCurrent().getTrophies() + 1);
                Panels.finalMessage(true);
                break;
            }

            if (Round.getCurrent().getPlayers().isEmpty()) {
                Match.getCurrent().setLife(Match.getCurrent().getLife() - 1);
                Panels.finalMessage(false);
                break;
            }
        }
    }

    public void pickPlayers() {
        command = new BuyTeamPlayer();
        System.out.println("Pick three players from the market to fight the opponent team.");
        Util.wait(1.0);

        while (true) {
            Panels.showMarket();
            Panels.showPlayersTeam();

            if (Market.getCurrent().getMachines().isEmpty()) {
                System.out.println("There's no more machines to buy...");
                System.out.println("The round is going to be started.");
                Util.wait(1.0);
                return;
            }

            int input = getInput();

            if (input < 1 || input > Market.getCurrent().getMachines().size()) {
                System.out.println("There's no such option.");
                continue;
            }

            CommandResponse result = command.execute(
                    new BuyTeamPlayerArgs(Market.getCurrent().getMachines().get(input - 1))
            );

            if (!result.isSuccess()) {
                System.out.println("You cannot buy any other team player.");
            }

            System.out.println("Do you wish to start the round? (1 for y, 0 for n)");
            int startRound = getInput();

            if (startRound == 1)
                break;
        }
    }

    public int getInput() {
        String input = scanner.nextLine();
        if (input == null || regex.matcher(input).find()) {
            return 0;
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}