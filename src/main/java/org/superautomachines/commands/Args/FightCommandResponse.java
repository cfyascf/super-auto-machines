package org.superautomachines.commands.Args;

import org.superautomachines.machines.Machine;

public class FightCommandResponse extends CommandResponse {
    private Machine player;
    private Machine opponent;
    private Machine winner;

    public FightCommandResponse(Machine player, Machine opponent, Machine winner, boolean success) {
        super(success);
        this.player = player;
        this.opponent = opponent;
        this.winner = winner;
    }

    public FightCommandResponse(Machine player, Machine opponent, Machine winner) {
        this(player, opponent, winner, true);
    }

    public Machine getPlayer() {
        return player;
    }

    public void setPlayer(Machine player) {
        this.player = player;
    }

    public Machine getOpponent() {
        return opponent;
    }

    public void setOpponent(Machine opponent) {
        this.opponent = opponent;
    }

    public Machine getWinner() {
        return winner;
    }

    public void setWinner(Machine winner) {
        this.winner = winner;
    }
}