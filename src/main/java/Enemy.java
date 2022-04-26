/**
 * Interface for enemies
 * Implements factory design patterns
 */

public interface Enemy {

    void attack();

    String toString();

     int getLevel();
    void setLevel(int levelMod);

     int getBaseAttack();
     void setBaseAttack(int attackModifier);

     int getBaseDefense();
     void setBaseDefense(int defenseModifier);

     int getHealthPoints();
    void changeHealthPoints(int healthModifier);

     int getSpeed();
    void changeSpeed(int speedModifier);

    int getXpBaseValue();


}
