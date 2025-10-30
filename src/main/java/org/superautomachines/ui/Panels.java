package org.superautomachines.ui;

import org.superautomachines.game.Market;
import org.superautomachines.game.Match;
import org.superautomachines.game.Round;
import org.superautomachines.machines.Machine;

public class Panels {
    public static void pTitle() {
        System.out.println("""
              _____ __ __  ____   ___  ____        ____  __ __  ______   ___       ___ ___   ____    __  __ __  ____  ____     ___  _____
             / ___/|  |  ||    \\ /  _]|    \\      /    ||  |  ||      | /   \\     |   |   | /    |  /  ]|  |  ||    ||    \\   /  _]/ ___/
            (   \\_ |  |  ||  o  )  [_ |  D  )    |  o  ||  |  ||      ||     |    | _   _ ||  o  | /  / |  |  | |  | |  _  | /  [_(   \\_ 
             \\__  ||  |  ||   _/    _]|    /     |     ||  |  ||_|  |_||  O  |    |  \\_/  ||     |/  /  |  _  | |  | |  |  ||    _]\\__  |
             /  \\ ||  :  ||  | |   [_ |    \\     |  _  ||  :  |  |  |  |     |    |   |   ||  _  /   \\_ |  |  | |  | |  |  ||   [_ /  \\ |
             \\    ||     ||  | |     ||  .  \\    |  |  ||     |  |  |  |     |    |   |   ||  |  \\     ||  |  | |  | |  |  ||     |\\    |
              \\___| \\__,_||__| |_____||__|\\_|    |__|__| \\__,_|  |__|   \\___/     |___|___||__|__|\\____||__|__||____||__|__||_____| \\___|
            """);
    }

    public static void menu() {
        System.out.println("""
            ----------------------------------
            |        CHOOSE YOUR OPTION      |
            ----------------------------------
            |         1. Start match         |
            |                                |
            ----------------------------------
        """);
    }

    public static void pMarket() {
        System.out.println("""
             __  __            _        _   
            |  \\/  |          | |      | |  
            | \\  / | __ _ _ __| | _____| |_ 
            | |\\/| |/ _` | '__| |/ / _ \\ __|
            | |  | | (_| | |  |   <  __/ |_ 
            |_|  |_|\\__,_|_|  |_|\\_\\___|\\__|
        """);
    }

    public static void pTeams() {
        System.out.println("""
              _______                       
             |__   __|                      
                | | ___  __ _ _ __ ___  ___ 
                | |/ _ \\/ _` | '_ ` _ \\/ __|
                | |  __/ (_| | | | | | \\__ \\
                |_|\\___|\\__,_|_| |_| |_|___/
        """);
    }

    public static void pYouLost() {
        System.out.println("""
             __     __           _           _   _ 
             \\ \\   / /          | |         | | | |
              \\ \\_/ /__  _   _  | | ___  ___| |_| |
               \\   / _ \\| | | | | |/ _ \\/ __| __| |
                | | (_) | |_| | | | (_) \\__ \\ |_|_|
                |_|\\___/ \\__,_| |_|\\___/|___/\\__(_)
        """);
    }

    public static void yourTeam() {
        System.out.println("""
            __   __                 _____                    
            \\ \\ / /__  _   _ _ __  |_   _|__  __ _ _ __ ___  
             \\ V / _ \\| | | | '__|   | |/ _ \\/ _` | '_ ` _ \\ 
              | | (_) | |_| | |      | |  __/ (_| | | | | | |
              |_|\\___/ \\__,_|_|      |_|\\___|\\__,_|_| |_| |_|
        """);
    }

    public static void opponents() {
        System.out.println("""
              ___                                     _       
             / _ \\ _ __  _ __   ___  _ __   ___ _ __ | |_ ___ 
            | | | | '_ \\| '_ \\ / _ \\| '_ \\ / _ \\ '_ \\| __/ __|
            | |_| | |_) | |_) | (_) | | | |  __/ | | | |_\\__ \\
             \\___/| .__/| .__/ \\___/|_| |_|\\___|_| |_|\\__|___/
                  |_|   |_|                                   
        """);
    }

    public static void vs() {
        System.out.println("""
            __     ______  
            \\ \\   / / ___| 
             \\ \\ / /\\___ \\ 
              \\ V /  ___) |
               \\_/  |____/     
        """);
    }

    public static void youWon() {
        System.out.println("""
             __   __           __        __          _ 
             \\ \\ / /__  _   _  \\ \\      / /__  _ __ | |
              \\ V / _ \\| | | |  \\ \\ /\\ / / _ \\| '_ \\| |
               | | (_) | |_| |   \\ V  V / (_) | | | |_|
               |_|\\___/ \\__,_|    \\_/\\_/ \\___/|_| |_(_)
        """);
    }

    public static void gameOver() {
        System.out.println("""
             ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ 
             ██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗
             ██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝
             ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗
             ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║
              ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝
        """);
    }

    public static void showMarket() {
        pMarket();
        System.out.println("* Your coins: " + Round.getCurrent().getCoins());
        if (Market.getCurrent().getMachines().isEmpty()) {
            System.out.println("...empty...");
        }

        int l = 0;
        for (Machine machine : Market.getCurrent().getMachines()) {
            l++;
            System.out.println(l + ". " + machine.getName().toUpperCase());
            System.out.println("Attack: " + machine.getAttack());
            System.out.println("Life: " + machine.getLife());
            System.out.println("Price: " + machine.getPrice());
            System.out.println();
        }
        System.out.println();
    }

    public static void showPlayersTeam() {
        yourTeam();
        if (Round.getCurrent().getPlayers().isEmpty()) {
            System.out.println("...empty...");
        }

        for (Machine machine : Round.getCurrent().getPlayers()) {
            showMachine(machine);
        }
        System.out.println();
    }

    public static void showOpponentsTeam() {
        opponents();
        for (Machine machine : Round.getCurrent().getOpponents()) {
            showMachine(machine);
            System.out.println();
        }
    }

    public static void showMachine(Machine machine) {
        System.out.println(machine.getName().toUpperCase());
        System.out.print("Attack: " + machine.getAttack());
        System.out.print(" - Life: " + machine.getLife());
        System.out.print(" - Tier: " + machine.getTier());
        System.out.println();
    }

    public static void introduceFight() {
        showOpponentsTeam();
        Util.wait(1.5);
        vs();
        Util.wait(1.1);
        showPlayersTeam();
        Util.wait(1.5);
    }

    public static void finalMessage(boolean result) {
        if (result) {
            youWon();
        } else {
            pYouLost();
        }

        Util.wait(1.0);
        System.out.println("You " + (result ? "won" : "lost") + " this round!");
        Util.wait(0.5);
        System.out.println("Trophies conquered: " + Match.getCurrent().getTrophies());
        Util.wait(0.5);
        System.out.println("Life remaining: " + Match.getCurrent().getLife());
        Util.wait(0.5);
        System.out.println("Another round is going to start...");
        Util.wait(1.0);
    }
}