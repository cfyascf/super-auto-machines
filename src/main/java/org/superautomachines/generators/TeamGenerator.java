package org.superautomachines.generators;

import org.superautomachines.machines.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class TeamGenerator {
    public List<Machine> generate(int teamSize) {
        List<Machine> comp = new ArrayList<>();

        for (int i = 0; i < teamSize; i++) {
            comp.add(createMachines());
        }

        return comp;
    }

    protected abstract Machine createMachines();
}