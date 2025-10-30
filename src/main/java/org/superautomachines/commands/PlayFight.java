package org.superautomachines.commands;

import org.superautomachines.commands.Args.CommandArgs;
import org.superautomachines.commands.Args.CommandResponse;
import org.superautomachines.commands.Args.FightCommandResponse;
import org.superautomachines.data.SingleFightResult;
import org.superautomachines.game.Round;

public class PlayFight implements ICommand {
    @Override
    public CommandResponse execute(CommandArgs args) {
        SingleFightResult result = Round.getCurrent().playFight();

        return new FightCommandResponse(result.player(), result.opponent(), result.winner());
    }
}