package org.superautomachines.ui;

import org.superautomachines.ui.interaction.IInteraction;

public class Game {
    private final IInteraction i;

    public Game(IInteraction consoleInteraction) {
        this.i = consoleInteraction;
    }

    public void init() {
        Panels.pTitle();
        Util.wait(1.2);

        i.menu();
    }
}