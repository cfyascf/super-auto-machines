package org.superautomachines.generators;

import org.superautomachines.machines.*;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Tier2TeamGenerator extends TeamGenerator {
    private final Random seed = new Random();

    private static final List<Supplier<Machine>> options = List.of(
            Lathe::new,
            MillingCutter::new,
            ColumnDrill::new
    );

    @Override
    protected Machine createMachines() {
        Supplier<Machine> machineSupplier = options.get(
                seed.nextInt(options.size())
        );
        return machineSupplier.get();
    }
}
