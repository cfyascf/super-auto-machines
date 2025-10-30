package org.superautomachines.data;

import org.superautomachines.machines.Machine;

public record SingleFightResult(Machine player, Machine opponent, Machine winner) { }