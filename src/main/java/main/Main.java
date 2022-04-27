package main;

/**
 * main.Main class to run when executing the game
 * @author Russell Hill
 */

public class Main {
    /**
     * The main method of the game.
     * @param args default
     */
    public static void main(String[] args) {

        RandomNumberGenerator ran = new RandomNumberGenerator();
        int raceRandomGen = ran.randomNumberGenerator(0,2);
        int instrumentRandomGen = ran.randomNumberGenerator(0,3);


        PlayerBuilder builder = new PlayerBuilder();
        builder.level = 1;
        switch (raceRandomGen) {
            case 0:
                builder.playerRace("Human");
                break;
            case 1:
                builder.playerRace("Elf");
                break;
            case 2:
                builder.playerRace("Orc");
                break;
            default:
                break;

        }
        switch (instrumentRandomGen) {
            case 0:
                builder.playerInstrument("Spoons");
                break;
            case 1:
                builder.playerInstrument("Cello");
                break;
            case 2:
                builder.playerInstrument("Guitar");
                break;
            case 3:
                builder.playerInstrument("Piano");
                break;
            default:
                break;

        }
        int classRandomGen = ran.randomNumberGenerator(0,3);
        switch (classRandomGen) {
            case 0:
                builder.playerClass("Bard");
                break;
            case 1:
                builder.playerClass("Troubadour");
                break;
            case 2:
                builder.playerClass("ChoirBoy");
                break;
            case 3:
                builder.playerClass("RockStar");
                break;
            default:
                break;

        }







        builder.build();
        System.out.println("**WELCOME TO HELL**\n The devil stole your soul and you "
                + "must battle your way to him and defeat him in a rock off to get it back");

        System.out.println("\n Your starting class/race/instrument now be chosen");
        Player player = new Player(builder);
        System.out.println(player);

        FloorMediator floorMediator = new FloorMediator();
        floorMediator.runGame(player);

    }
}
