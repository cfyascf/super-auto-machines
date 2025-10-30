package org.superautomachines.commands;

import org.superautomachines.commands.Args.BuyTeamPlayerArgs;
import org.superautomachines.commands.Args.CommandArgs;
import org.superautomachines.commands.Args.CommandResponse;
import org.superautomachines.game.Market;
import org.superautomachines.machines.Machine;

public class BuyTeamPlayer implements ICommand {
    @Override
    public CommandResponse execute(CommandArgs args) {
        if (!(args instanceof BuyTeamPlayerArgs teamPlayerArgs)) {
            return CommandResponse.FAILED;
        }

        Machine newMachine = teamPlayerArgs.getNewMachine();
        boolean success = Market.getCurrent().buyMachine(newMachine);

        return new CommandResponse(success);
    }
}