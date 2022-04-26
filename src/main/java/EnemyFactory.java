/**
 * Enemy factory
 */

public class EnemyFactory {
    public Enemy createEnemy(String enemyType){
        if (enemyType == null || enemyType.isEmpty())
            return null;
        switch (enemyType) {
            case "EnemyBoss":
                return new EnemyBoss();
            case "EnemyElite":
                return new EnemyElite();
            case "EnemyNormal":
                return new EnemyNormal();
            default:
                throw new IllegalArgumentException("Unknown Enemy Type");

        }
    }
}
