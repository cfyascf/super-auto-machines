package org.superautomachines.generators;

import org.superautomachines.machines.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class TeamGenerator {
    public List<Machine> generate(int teamSize) {
        Random seed = new Random();
        List<Machine> comp = new ArrayList<>();

        for (int i = 0; i < teamSize; i++) {
            int tier = seed.nextInt(2) + 1; // Sorteia 1 ou 2

            switch (tier) {
                case 1:
                    comp.add(createTierOneMachine());
                    break;
                case 2:
                    comp.add(createTierTwoMachine());
                    break;
            }
        }
        return comp;
    }

    protected abstract Machine createTierOneMachine();

    protected abstract Machine createTierTwoMachine();
}