public class Combat {

    private int attackPower;
    private int defencePower;
    private int damageInflicted = 0;

    public  void basicAttackPlayer(Player player, Enemy enemy){
        attackPower = player.getBaseAttack();
        defencePower = enemy.getBaseDefense();

        if (attackPower > defencePower){
            enemy.changeHealthPoints(defencePower-attackPower);
            damageInflicted = attackPower-defencePower;
        }

        System.out.println("You attacked with a value of " + attackPower + " the enemy defended with a power of "
        + defencePower + ". " + damageInflicted + " points of damage inflicted! [" + enemy.getHealthPoints()
        +" hit points remaining]");

    }

    public  void basicAttackEnemy(Player player, Enemy enemy){
        attackPower = enemy.getBaseAttack();
        defencePower = player.getBaseDefence();

        if (attackPower > defencePower){
           player.changeHealthPoints(defencePower-attackPower);
            damageInflicted = attackPower-defencePower;
        } else {
            damageInflicted = 0;
        }

        System.out.println("Enemy attacked with a value of " + attackPower + " you defended with a power of "
                + defencePower + ". " + damageInflicted + " points of damage inflicted! [" + player.getHealthPoints()
        +" hit points remaining]");

    }
}
