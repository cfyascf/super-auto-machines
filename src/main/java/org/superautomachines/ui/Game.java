package org.superautomachines.ui;

public class Game {
    private static Interaction i = new Interaction();

    public static Interaction getInteraction() {
        return i;
    }

    public static void setInteraction(Interaction interaction) {
        i = interaction;
    }

    public static void init() {
        Panels.pTitle();
        Util.wait(1.2);

        i.menu();
    }
}