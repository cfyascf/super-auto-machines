package org.superautomachines.commands.Args;

import org.superautomachines.data.RoundResult;

public class RoundCommandResponse extends CommandResponse {
    private RoundResult roundResult;

    public RoundCommandResponse(RoundResult result, boolean success) {
        super(success);
        this.roundResult = result;
    }

    public RoundCommandResponse(RoundResult result) {
        this(result, true);
    }

    public RoundResult getRoundResult() {
        return roundResult;
    }

    public void setRoundResult(RoundResult roundResult) {
        this.roundResult = roundResult;
    }
}