/**
 * Implementation of interface for enemy
 * Factory design pattern
 */

public class EnemyBoss implements Enemy {

    private int level = 5;
    int baseAttack = 10;
    int baseDefense = 0;
    int healthPoints = 50;
    int speed = 100;
    int xpBaseValue = 25;

    @Override
    public void attack(){

    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Enemy [Enemy level is: ").append(level).append(", base attack is: ")
                .append(baseAttack).append(", base defence is: ").append(baseDefense).append(", rep remaining: ")
                .append(healthPoints).append("]");
        return builder.toString();
    }

    @Override
    public int getXpBaseValue(){
        return xpBaseValue;
    }

    @Override
    public int getLevel(){
     return this.level;
    }

    @Override
    public void setLevel(int levelMod){
        this.level += levelMod;
    }

    @Override
    public int getBaseAttack(){
        return this.baseAttack;
    }

    @Override
    public void setBaseAttack(int attackModifier){
        this.baseAttack += attackModifier;
    }

    @Override
    public int getBaseDefense() {
        return this.baseDefense;
    }

    @Override
    public void setBaseDefense(int defenseModifier) {
        this.baseDefense += defenseModifier;
    }

    @Override
    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void changeHealthPoints(int healthModifier) {
        this.healthPoints += healthModifier;
    }

    @Override
    public void changeSpeed(int speedModifier){
        this.speed += speedModifier;
    }

    @Override
    public int getSpeed(){
        return this.speed;
    }



}
