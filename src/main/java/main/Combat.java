package main;

public class Combat {

    private int attackPower;
    private int defencePower;
    private int damageInflicted = 0;

    public  void basicAttackPlayer(Player player, Enemy enemy){
        attackPower = player.getBaseAttack();
        defencePower = enemy.getBaseDefense();

        if (player.skills.get(2) != null){
            attackPower += 5;
        }

       if (player.getSkillMeter() >= 10){
           if (player.skills.get(1) != null){
               System.out.println("POWER CHORD ATTACK! Your next attack will deal double damage");
               attackPower = attackPower * player.skills.get(1).skillAttackModifier;
               player.setSkillMeter(0);
           }
       }

        if (attackPower > defencePower){
            enemy.changeHealthPoints(defencePower-attackPower);
            damageInflicted = attackPower-defencePower;
            player.changeSkillMeter(1);
        }

        System.out.println("You attacked with a value of " + attackPower + " the enemy defended with a power of "
        + defencePower + ". " + damageInflicted + " points of damage to their rep! [" + enemy.getHealthPoints()
        +" rep remaining]");

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

        System.out.println("main.Enemy attacked with a value of " + attackPower + " you defended with a power of "
                + defencePower + ". " + damageInflicted + " points of damage to your rep! [" + player.getHealthPoints()
        +" rep remaining]");

    }
}
