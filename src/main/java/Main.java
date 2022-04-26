/**
 * Main class to run when executing the game
 * @author Russell Hill
 */

public class Main {
        public static void main(String[] args){

            PlayerBuilder builder = new PlayerBuilder();
            builder.level = 1;
            builder.playerRace("Elf");
            builder.playerInstrument("Piano");
            builder.playerClass("ChoirBoy");
            Player player = new Player(builder);

            builder.build();
            System.out.println(player);


        }
}
