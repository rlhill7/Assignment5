package main;

/**
 * Class for carrying out combat.
 */
public class Combat {

    private int attackPower;
    private int defencePower;
    private int damageInflicted = 0;

    /**
     * Player attacking enemy.
     * @param player the player
     * @param enemy the enemy being attacked
     */
    public  void basicAttackPlayer(Player player, Enemy enemy) {
        attackPower = player.getBaseAttack();
        defencePower = enemy.getBaseDefense();

        if (player.skills.get(2) != null) {
            attackPower += 5;
        }

        if (player.getSkillMeter() >= 10) {
            if (player.skills.get(1) != null) {
                System.out.println("POWER CHORD ATTACK! Your next attack will deal double damage");
                attackPower = attackPower * player.skills.get(1).skillAttackModifier;
                player.setSkillMeter(0);
            }
        }

        if (attackPower > defencePower) {
            enemy.changeHealthPoints(defencePower - attackPower);
            damageInflicted = attackPower - defencePower;
            player.changeSkillMeter(1);
        }

        System.out.println("You attacked with a value of " + attackPower
                + " the enemy defended with a power of "
            + defencePower + ". " + damageInflicted + " points of damage to their rep! ["
                + enemy.getHealthPoints() + " rep remaining]");

    }

    /**
     * Attack of enemy against player.
     * @param player the player being attacked
     * @param enemy the enmy attacking
     */
    public  void basicAttackEnemy(Player player, Enemy enemy) {
        attackPower = enemy.getBaseAttack();
        defencePower = player.getBaseDefence();

        if (attackPower > defencePower) {
            player.changeHealthPoints(defencePower - attackPower);
            damageInflicted = attackPower - defencePower;
        } else {
            damageInflicted = 0;
        }

        System.out.println("Enemy attacked with a value of " + attackPower
                + " you defended with a power of "
                + defencePower + ". " + damageInflicted + " points of damage to your rep! ["
                + player.getHealthPoints() + " rep remaining]");

    }
}
