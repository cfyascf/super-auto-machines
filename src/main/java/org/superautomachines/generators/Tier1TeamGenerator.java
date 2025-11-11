package org.superautomachines.generators;

import org.superautomachines.machines.Hammer;
import org.superautomachines.machines.Machine;
import org.superautomachines.machines.Screwdriver;
import org.superautomachines.machines.Treadmill;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Tier1TeamGenerator extends TeamGenerator {
    private final Random seed = new Random();

    private static final List<Supplier<Machine>> options = List.of(
            Hammer::new,
            Screwdriver::new,
            Treadmill::new
    );

    @Override
    protected Machine createMachines() {
        Supplier<Machine> machineSupplier = options.get(
                seed.nextInt(options.size())
        );
        return machineSupplier.get();
    }
}
