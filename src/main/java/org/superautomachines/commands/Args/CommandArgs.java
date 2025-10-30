package org.superautomachines.commands.Args;

public class CommandArgs {

    private Class<?> args;

    public CommandArgs(Class<?> args) {
        this.args = args;
    }

    public Class<?> getArgs() {
        return args;
    }

    public void setArgs(Class<?> args) {
        this.args = args;
    }

    public static CommandArgs argsInstance = null;
}