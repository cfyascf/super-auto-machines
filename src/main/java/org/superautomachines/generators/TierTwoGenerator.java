package org.superautomachines.generators;

import org.superautomachines.machines.ColumnDrill;
import org.superautomachines.machines.Lathe;
import org.superautomachines.machines.Machine;
import org.superautomachines.machines.MillingCutter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class TierTwoGenerator {

    public static List<Machine> Possibilities = new ArrayList<>();

    private TierTwoGenerator() {
    }

    public static void setPossibilities() {
        Possibilities.clear();

        Possibilities.add(new Lathe());
        Possibilities.add(new MillingCutter());
        Possibilities.add(new ColumnDrill());
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
