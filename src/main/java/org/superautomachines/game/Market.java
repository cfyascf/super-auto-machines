package org.superautomachines.game;

import java.util.*;

import org.superautomachines.generators.TeamGenerator;
import org.superautomachines.machines.Machine;

public class Market {
    private List<Machine> machines = new ArrayList<>();
    private static Market crr = null;

    public static Market getCurrent() {
        if (crr == null) {
            crr = new Market();
            crr.setMachines();
        }
        return crr;
    }

    public static Market newMarket() {
        crr = new Market();
        crr.setMachines();
        return getCurrent();
    }

    public void setMachines() {
        machines = TeamGenerator.generate(3);
    }

    public boolean buyMachine(Machine m) {
        if (!machines.contains(m))
            return false;

        if (Round.getCurrent().getPlayers().size() >= 5)
            return false;

        if (Round.getCurrent().getCoins() < m.getPrice())
            return false;

        Round.getCurrent().setCoins(Round.getCurrent().getCoins() - m.getPrice());
        Round.getCurrent().getPlayers().add(m);
        machines.remove(m);

        return true;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}