package org.superautomachines.generators;

import org.superautomachines.machines.*;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomTeamGenerator extends TeamGenerator {
    private static final List<Supplier<Machine>> TIER_ONE_POSSIBILITIES = List.of(
            Hammer::new,
            Screwdriver::new,
            Treadmill::new
    );

    private static final List<Supplier<Machine>> TIER_TWO_POSSIBILITIES = List.of(
            Lathe::new,
            MillingCutter::new,
            ColumnDrill::new
    );

    private final Random seed = new Random();

    @Override
    protected Machine createTierOneMachine() {
        Supplier<Machine> machineSupplier = TIER_ONE_POSSIBILITIES.get(
                seed.nextInt(TIER_ONE_POSSIBILITIES.size())
        );
        return machineSupplier.get();
    }

    @Override
    protected Machine createTierTwoMachine() {
        Supplier<Machine> machineSupplier = TIER_TWO_POSSIBILITIES.get(
                seed.nextInt(TIER_TWO_POSSIBILITIES.size())
        );
        return machineSupplier.get();
    }
}