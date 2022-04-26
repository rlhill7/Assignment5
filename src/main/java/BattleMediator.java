public class BattleMediator {
    private Player player;
    private Enemy enemy;
    private Floor floor;
    private boolean playerFirstAttack = false;

    public void battle(Player player, Enemy enemy){

    Combat combat = new Combat();

    if (player.getSpeed() >= enemy.getSpeed()){
        combat.basicAttackPlayer(player, enemy);
        playerFirstAttack = true;
    }
    combat.basicAttackEnemy(player,enemy);
    while(enemy.getHealthPoints()>0){
        if (playerFirstAttack == true){
            combat.basicAttackPlayer(player, enemy);
            combat.basicAttackEnemy(player, enemy);
            if (player.getHealthPoints()<=0){
                System.out.println("You lost the combat");
                break;
            }
        }
        combat.basicAttackEnemy(player, enemy);
        if (player.getHealthPoints()<=0){
            System.out.println("You lost the combat");
            break;
        }
        combat.basicAttackPlayer(player, enemy);
    }

    }
}
