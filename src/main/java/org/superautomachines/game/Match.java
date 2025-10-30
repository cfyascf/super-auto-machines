package org.superautomachines.game;

public class Match {
    private int life = 5;
    private int trophies = 0;
    private static Match crr = null;

    public static Match getCurrent() {
        if (crr == null) {
            crr = new Match();
        }
        return crr;
    }

    public static void newMatch() {
        crr = new Match();
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
}