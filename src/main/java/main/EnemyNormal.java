package main;

/**
 * Normal enemy class factory design pattern.
 *
 */

public class EnemyNormal implements Enemy {
    int level = 1;
    int baseAttack = 2;
    int baseDefense = 0;
    int healthPoints = 10;
    int speed = 1;
    int xpBaseValue = 10;

    @Override
    public void attack(){

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Normal Enemy [Enemy level is: ").append(level)
                .append(", base attack is: ").append(baseAttack).append(", base defence is: ")
                .append(baseDefense).append(", rep: ").append(healthPoints).append("]");
        return builder.toString();
    }

    @Override
    public int getXpBaseValue() {
        return xpBaseValue;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int levelMod) {
        level += levelMod;
    }

    @Override
    public int getBaseAttack() {
        return baseAttack;
    }

    @Override
    public void setBaseAttack(int attackModifier) {
        baseAttack += attackModifier;
    }

    @Override
    public int getBaseDefense() {
        return baseDefense;
    }

    @Override
    public void setBaseDefense(int defenseModifier) {
        baseDefense += defenseModifier;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    public void changeHealthPoints(int healthModifier) {
        healthPoints += healthModifier;
    }

    @Override
    public void changeSpeed(int speedModifier) {
        this.speed += speedModifier;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

}
