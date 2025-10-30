package org.superautomachines.commands.Args;

public class CommandResponse {
    private boolean success;

    public CommandResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static final CommandResponse SUCCESSFUL = new CommandResponse(true);
    public static final CommandResponse FAILED = new CommandResponse(false);
}