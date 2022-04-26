/**
 * Player class
 * @author Russell Hill
 */
public class Player {

    //default player parameters
    private int healthPoints = 100;
    private int level;
    private String playerRace;
    private String playerClass ;
    private String playerInstrument;
    private double xp;
    private double xpModifier;
    private int baseAttack;
    private int baseDefence;
    private int speed = 10;

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

    public int getHealthPoints(){
        return healthPoints;
    }

    public void changeHealthPoints(int healthDifference){
        healthPoints += healthDifference;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBaseAttack(){
        return baseAttack;
    }

    public void setBaseAttack(int attackModifier){
        baseAttack += attackModifier;
    }

    public int getBaseDefence(){
        return baseDefence;
    }

    public void setBaseDefence(int defenceModifier){
        baseDefence += defenceModifier;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Player [player level is: ").append(level).append(", race is: ").append(playerRace)
                .append(", class is: ").append(playerClass).append(", instrument is: ")
                .append(playerInstrument).append(", xp modifier is: ").append(xpModifier).append(", base attack is: ")
                .append(baseAttack).append(", base defence is: ").append(baseDefence).append(", healthpoints remaining: ").append(healthPoints).append("]");
        return builder.toString();
    }



}
