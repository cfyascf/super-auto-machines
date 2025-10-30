package org.superautomachines.generators;

import org.superautomachines.machines.Machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class TeamGenerator {
    private TeamGenerator() {
    }

    public static List<Machine> generate(int teamSize) {
        Random seed = new Random();
        List<Machine> comp = new ArrayList<>();

        for (int i = 0; i < teamSize; i++) {
            int tier = seed.nextInt(2) + 1;

            switch (tier) {
                case 1:
                    comp.add(TierOneGenerator.pickMachine());
                    break;
                case 2:
                    comp.add(TierTwoGenerator.pickMachine());
                    break;
            }
        }

        return comp;
    }
}
