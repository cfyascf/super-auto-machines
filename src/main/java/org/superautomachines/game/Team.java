package org.superautomachines.game;

import org.superautomachines.machines.Machine;
import java.util.*;

public class Team {
    private List<Machine> comp = new ArrayList<>();

    public void addMachine(Machine m) {
        if (comp.size() == 5) {
            throw new RuntimeException("Team only accepts at max 5 machines.");
        }
        comp.add(m);
    }

    public List<Machine> getComp() {
        return comp;
    }

    public void setComp(List<Machine> comp) {
        this.comp = comp;
    }
}