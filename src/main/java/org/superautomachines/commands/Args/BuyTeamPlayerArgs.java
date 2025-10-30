package org.superautomachines.commands.Args;

import org.superautomachines.machines.Machine;

public class BuyTeamPlayerArgs extends CommandArgs {
    private Machine newMachine;

    public BuyTeamPlayerArgs(Machine m, Class<?> args) {
        super(args);
        this.newMachine = m;
    }

    public BuyTeamPlayerArgs(Machine m) {
        this(m, null);
    }

    public Machine getNewMachine() {
        return newMachine;
    }

    public void setNewMachine(Machine newMachine) {
        this.newMachine = newMachine;
    }
}