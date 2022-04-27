package main;//package java;

/**
 * Mediator pattern to direct the flow of combat.
 */
public class BattleMediator {

    private boolean didPlayerAttackLast = false;

    /**
     * Conducts a battle between the player and enemy.
     * @param player the player surrogate
     * @param enemy The enemy to be battled
     */
    public boolean battle(Player player, Enemy enemy) {

        Combat combat = new Combat();

        // checks who goes first then performs an attack
        if (player.getSpeed() >= enemy.getSpeed()) {
            combat.basicAttackPlayer(player, enemy);
            didPlayerAttackLast = true;
        }
        if (enemy.getHealthPoints() > 0) {
            combat.basicAttackEnemy(player, enemy);
        }
        didPlayerAttackLast = false;
        //checks if enemy is dead, if not continues battle
        while (enemy.getHealthPoints() > 0) {
            if (didPlayerAttackLast == false) {
                combat.basicAttackPlayer(player, enemy);
                didPlayerAttackLast = true;
                if (player.getHealthPoints() <= 0) {
                    System.out.println("You lost the combat");
                    return false;
                }
            }
            if (enemy.getHealthPoints() > 0) {
                combat.basicAttackEnemy(player, enemy);
                didPlayerAttackLast = false;
            }
            if (player.getHealthPoints() <= 0) {
                System.out.println("You lost the combat");
                return false;
            }
        }
        return true;
    }
}
