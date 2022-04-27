package main;

/**
 * Mediator design pattern to run the floors.
 * Floor is made up of 4 levels.
 * Enemies scale up on each floor.
 */

public class FloorMediator {

    int mercyRule;

    /**
     * Mediates the playing of the game.
     * @param player the player that was generated
     */
    public void runGame(Player player) {

        RandomNumberGenerator ran = new RandomNumberGenerator();


        Floor floor = new Floor();
        EnemyFactory enemyFactory = new EnemyFactory();
        BattleMediator battleMediator = new BattleMediator();


        while (floor.getFloorNumber() < 10) {

            //Generates a seed for the floor then modifies the players attributes based on that seed
            int floorSeed = ran.randomNumberGenerator(0,2);
            floor.getFloorMods(floorSeed);
            player.setBaseAttack(floor.getFloorAttackPowerModifier());
            player.setXpModifier(player.getXpModifier() + floor.getFloorXpModifier());
            player.setBaseDefence(floor.getFloorDefensePowerModifier());
            Enemy testEnemy;
            //loops through the levels on a floor generating enemies to fight
            while (floor.getLevelNumber() < 4) {
                if (ran.randomNumberGenerator(0,10) > 7) {
                    testEnemy = enemyFactory.createEnemy("main.EnemyElite");
                } else {
                    testEnemy = enemyFactory.createEnemy("main.EnemyNormal");
                }
                testEnemy.changeHealthPoints((2 * floor.getFloorNumber() + floor.getLevelNumber()));
                System.out.println("You encounter a(n) " + testEnemy);
                if (battleMediator.battle(player, testEnemy)) {
                    floor.changeLevelNumber(1);
                    player.changeXp(testEnemy.getXpBaseValue() * player.getXpModifier());
                    if (player.getXp() > 100) {
                        player.levelUp();
                    }
                } else {
                    //if a player loses a floor more than ten times then the game is over
                    if (mercyRule > 10) {
                        System.out.println("Looks like you might be tone deaf. "
                                + "Why you got in the fiddle battle"
                                + " with the devil in the first place is yet to be discovered.\n"
                                + "**GAME OVER**\n Character was unable to progress through hell.");
                        System.exit(0);
                    }
                    floor.changeLevelNumber(-floor.getLevelNumber());
                    mercyRule += 1;
                }
            }

            //boss at end of each floor
            System.out.println("You've encountered the boss of the floor. Good luck!");
            Enemy bossEnemy = enemyFactory.createEnemy("main.EnemyBoss");
            if (battleMediator.battle(player, bossEnemy)) {
                //removes the floor attributes
                player.setXpModifier(player.getXpModifier() - floor.getFloorXpModifier());
                player.setBaseDefence(-floor.getFloorDefensePowerModifier());
                player.setBaseAttack(-floor.getFloorAttackPowerModifier());

                //progresses the floor
                floor.changeFloorNumber(1);
                floor.changeLevelNumber(-4);
                player.changeXp((bossEnemy.getXpBaseValue() * player.getXpModifier()));
                if (player.getXp() > 100) {
                    player.levelUp();

                }
            } else {
                //if the player loses the run is over
                System.out.println("You have lost the rock off against the boss... Hope you like"
                        + " fiddle music because you're going to be here a while."
                        + "\n **GAME OVER**\n"
                        + "You made it to floor: " + floor.getFloorNumber() + "\nYou were level: "
                    + player.getPlayerLevel());
                System.exit(0);
            }
        }
        System.out.println("Victory!!!!");
    }
}
