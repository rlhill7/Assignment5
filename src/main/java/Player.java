/**
 * Player class
 * @author Russell Hill
 */
public class Player {

    //default player parameters
    private int hitPoints = 100;
    private int level;
    private String playerRace;
    private String playerClass ;
    private String playerInstrument;
    private double xp;
    private double xpModifier;
    private int baseAttack;
    private int baseDefence;

    /**
     * builder for the player using the builder design pattern
     * @param playerBuilder the player builder object
     */
    public Player(PlayerBuilder playerBuilder) {
        if (playerBuilder == null) {
            throw new IllegalArgumentException("Please provide player builder");
        }

        this.playerRace = playerBuilder.playerRace;
        this.level = playerBuilder.level;
        this.playerClass = playerBuilder.playerClass;
        this.playerInstrument = playerBuilder.playerInstrument;
        this.xpModifier = playerBuilder.xpModifier;
        this.baseAttack = playerBuilder.baseAttack;
        this.baseDefence = playerBuilder.baseDefense;

    }

    public int getPlayerLevel(){
        return level;
    }

    public String getPlayerRace(){
        return playerRace;
    }

    public String getPlayerClass(){
        return playerClass;
    }

    public String getPlayerInstrument(){
        return playerInstrument;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Player [player level is: ").append(level).append(", race is: ").append(playerRace)
                .append(", class is: ").append(playerClass).append(", instrument is: ")
                .append(playerInstrument).append(", xp modifier is: ").append(xpModifier).append(", base attack is: ")
                .append(baseAttack).append(", base defence is: ").append(baseDefence);
        return builder.toString();
    }



}
