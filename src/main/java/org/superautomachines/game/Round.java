package org.superautomachines.game;

import org.superautomachines.data.RoundResult;
import org.superautomachines.data.SingleFightResult;
import org.superautomachines.generators.RandomTeamGenerator;
import org.superautomachines.generators.TeamGenerator;
import org.superautomachines.machines.Machine;
import java.util.*;

public class Round {
    private List<Machine> opponents = new ArrayList<>();
    private List<Machine> players = new ArrayList<>();
    private int coins = 10;
    private static Round crr = null;

    public static Round getCurrent() {
        if (crr == null) {
            crr = new Round();
        }
        return crr;
    }

    public static void newRound() {
        crr = new Round();
        getCurrent().buildOpponentsComp();
        Market.newMarket();
    }

    public void buildOpponentsComp() {
        Market.newMarket();
        Random random = new Random();
        int teamSize = 3 + random.nextInt(3);

        TeamGenerator myGenerator = new RandomTeamGenerator();
        opponents = myGenerator.generate(teamSize);
    }

    public SingleFightResult playFight() {
        RoundResult result = RoundResult.EVEN;
        Machine crrPlayer = players.get(players.size() - 1);
        Machine crrOpponent = opponents.get(0);

        while (result == RoundResult.EVEN) {
            result = crrPlayer.fight(crrOpponent);

            if (result == RoundResult.WIN) {
                opponents.remove(crrOpponent);
                return new SingleFightResult(crrPlayer, crrOpponent, crrPlayer);
            }

            if (result == RoundResult.LOSS) {
                players.remove(crrPlayer);
                return new SingleFightResult(crrPlayer, crrOpponent, crrOpponent);
            }
        }

        return null;
    }

    public List<Machine> getOpponents() {
        return opponents;
    }

    public void setOpponents(List<Machine> opponents) {
        this.opponents = opponents;
    }

    public List<Machine> getPlayers() {
        return players;
    }

    public void setPlayers(List<Machine> players) {
        this.players = players;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}