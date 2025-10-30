package org.superautomachines.commands;

import org.superautomachines.commands.Args.CommandArgs;
import org.superautomachines.commands.Args.CommandResponse;

public interface ICommand {
    CommandResponse execute(CommandArgs args);
}