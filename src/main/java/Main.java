import java.util.Random;

/**
 * Main class to run when executing the game
 * @author Russell Hill
 */

public class Main {
        public static void main(String[] args){

            RandomNumberGenerator ran = new RandomNumberGenerator();
            int classRandomGen = ran.randomNumberGenerator(0,2);

            PlayerBuilder builder = new PlayerBuilder();
            builder.level = 1;
            switch (classRandomGen){
                case 0:
                    builder.playerRace("Human");
                    break;
                case 1:
                    builder.playerRace("Elf");
                    break;
                case 2:
                    builder.playerRace("Orc");
                    break;

            }
            builder.playerInstrument("Piano");
            builder.playerClass("ChoirBoy");
            Player player = new Player(builder);



            System.out.println(classRandomGen);

            builder.build();
            System.out.println("**WELCOME TO HELL**\n The devil stole your soul and you " +
                    "must battle your way to him and defeat him in a rock off to get it back");

            System.out.println("\n Your starting class/race/instrument now be chosen");


            EnemyFactory enemyFactory= new EnemyFactory();
            Enemy testEnemy = enemyFactory.createEnemy("EnemyBoss");
            System.out.println(testEnemy);




            System.out.println(player);


        }
}
