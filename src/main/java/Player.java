/**
 * Player class
 * @author Russell Hill
 */
public class Player {

    //default player parameters
    private int level;
    private Race playerRace;
    private Class playerClass ;
    private Instrument playerInstrument;

    public Player(PlayerBuilder playerBuilder) {
        if (playerBuilder == null) {
            throw new IllegalArgumentException("Please provide player builder");
        }

        this.playerRace = playerBuilder.playerRace;
        this.level = playerBuilder.level;
        this.playerClass = playerBuilder.playerClass;
        this.playerInstrument = playerBuilder.playerInstrument;
    }

    public int getPlayerLevel(){
        return level;
    }

    public Race getPlayerRace(){
        return playerRace;
    }

    public Class getPlayerClass(){
        return playerClass;
    }

    public Instrument getPlayerInstrument(){
        return playerInstrument;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Player [player level is: ").append(level).append(", race is: ").append(playerRace).append(", class is: ").append(playerClass)
                .append(", instrument is: ").append(playerInstrument);
        return builder.toString();
    }


}
