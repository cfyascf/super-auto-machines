package org.superautomachines.generators;

import org.superautomachines.machines.Hammer;
import org.superautomachines.machines.Machine;
import org.superautomachines.machines.Screwdriver;
import org.superautomachines.machines.Treadmill;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class TierOneGenerator {

    public static List<Machine> Possibilities = new ArrayList<>();

    private TierOneGenerator() {
    }

    public static void setPossibilities() {
        Possibilities.clear();

        Possibilities.add(new Hammer());
        Possibilities.add(new Screwdriver());
        Possibilities.add(new Treadmill());
    }

    public static Machine pickMachine() {
        if (Possibilities.isEmpty()) {
            setPossibilities();
        }

        Random seed = new Random();
        int rnd = seed.nextInt(Possibilities.size());

        return Possibilities.get(rnd);
    }
}
