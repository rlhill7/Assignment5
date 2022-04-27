package main;

/**
 * Enemy factory.
 */

public class EnemyFactory {
    /**
     * Creates the enemies.
     * @param enemyType the type of enemy to be created
     * @return the enemy created
     */
    public Enemy createEnemy(String enemyType) {
        if (enemyType == null || enemyType.isEmpty()) {
            return null;
        }
        switch (enemyType) {
            case "main.EnemyBoss":
                return new EnemyBoss();
            case "main.EnemyElite":
                return new EnemyElite();
            case "main.EnemyNormal":
                return new EnemyNormal();
            default:
                throw new IllegalArgumentException("Unknown main.Enemy Type");

        }
    }
}
