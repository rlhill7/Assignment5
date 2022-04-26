/**
 * Interface for enemies
 * Implements factory design patterns
 */

public interface Enemy {

    void attack();

    String toString();

     int getLevel();
    void setLevel(int levelMod);

    public int getBaseAttack();
    public void setBaseAttack(int attackModifier);

    public int getBaseDefense();
    public void setBaseDefense(int defenseModifier);

    public int getHealthPoints();
    void changeHealthPoints(int healthModifier);

}
