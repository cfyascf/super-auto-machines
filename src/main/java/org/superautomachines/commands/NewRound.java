package org.superautomachines.commands;

import org.superautomachines.commands.Args.CommandArgs;
import org.superautomachines.commands.Args.CommandResponse;
import org.superautomachines.game.Round;

public class NewRound implements ICommand {
    @Override
    public CommandResponse execute(CommandArgs args) {
        Round.newRound();
        return CommandResponse.SUCCESSFUL;
    }
}