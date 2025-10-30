package org.superautomachines.commands;

import org.superautomachines.commands.Args.CommandArgs;
import org.superautomachines.commands.Args.CommandResponse;
import org.superautomachines.game.Match;

public class NewMatch implements ICommand {
    @Override
    public CommandResponse execute(CommandArgs args) {
        Match.newMatch();
        return CommandResponse.SUCCESSFUL;
    }
}