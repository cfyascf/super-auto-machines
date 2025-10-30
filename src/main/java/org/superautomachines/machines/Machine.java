package org.superautomachines.machines;

import org.superautomachines.data.RoundResult;

public abstract class Machine {
    private String name;
    private int level = 1;
    private int experience = 1;
    private int tier;
    private int attack;
    private int life;
    private int price = 3;

    public Machine(int tier, int attack, int life, String name) {
        this.tier = tier;
        this.attack = attack;
        this.life = life;
        this.name = name;
    }

    public RoundResult fight(Machine enemy) {
        enemy.setLife(enemy.getLife() - this.attack);
        this.setLife(this.life - enemy.getAttack());

        if (this.life <= 0) {
            return RoundResult.LOSS;
        }

        if (enemy.getLife() <= 0) {
            return RoundResult.WIN;
        }

        return RoundResult.EVEN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}