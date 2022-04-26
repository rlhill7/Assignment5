/**
 * Enemy elite
 * factory design pattern
 */
public class EnemyElite implements Enemy {

    int level = 2;
    int baseAttack = 3;
    int baseDefense = 5;
    int healthPoints = 20;

    @Override
    public void attack(){

    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Enemy [Enemy level is: ").append(level).append(", base attack is: ")
                .append(baseAttack).append(", base defence is: ").append(baseDefense).append("]");
        return builder.toString();
    }


    @Override
    public int getLevel(){
        return level;
    }

    @Override
    public void setLevel(int levelMod){
        level += levelMod;
    }

    @Override
    public int getBaseAttack(){
        return baseAttack;
    }

    @Override
    public void setBaseAttack(int attackModifier){
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
    public int getHealthPoints(){
        return healthPoints;
    }

    public void changeHealthPoints(int healthModifier) {
        healthPoints += healthModifier;
    }


}
