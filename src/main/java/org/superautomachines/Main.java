package org.superautomachines;

import org.superautomachines.ui.Game;
import org.superautomachines.ui.interaction.ConsoleInteraction;
import org.superautomachines.ui.interaction.IInteraction;

public class Main {
    public static void main(String[] args) {
        IInteraction myInteraction = new ConsoleInteraction();
        Game game = new Game(myInteraction);

        game.init();
    }
}