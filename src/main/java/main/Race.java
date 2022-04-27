package main;

/**
 * main.Race class
 * @author Russell Hill
  */
class Race {
    private String raceName = "";
    private int baseAttack;
    private int level = 0;
    private double xpModifier = 0;
    private int baseDefence;

    /**
     * Gets base attack
     * @return Base attack
     */
    public int getBaseAttack() {
        return baseAttack;
    }
    public int getBaseDefence(){
        return baseDefence;
    }

    /**
     * Constructor for race obj
     * @param playerRace the race in string format
     */
    public Race(String playerRace){
        this.raceName = playerRace;

        switch (raceName) {
            case "Human":
                baseAttack = 1;
                xpModifier += .3;
                break;

            case "Orc":
                baseAttack = 5;
                level = 1;
                break;

            case "Elf":
                baseAttack = 12;
                baseDefence = 5;
                level = 5;
                xpModifier -= .2;
                break;
        }
    }

    /**
     * Get level
     * @return the level modifier of class
     */
    public int getLevel() {
        return level;
    }

    public double getXpModifier() {
        return xpModifier;
    }
}
