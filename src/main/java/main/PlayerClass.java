package main;

/**
 * main.Player class
 */

public class PlayerClass {

    private String className = "";
    private int baseAttack = 0;
    private double xpModifier = 0;
    private int level = 0;

    public PlayerClass(String playerClass){
        this.className = playerClass;

        switch (className) {
            case "Bard":
                baseAttack += 1;
                xpModifier += .3;
                break;

            case "Troubadour":
                baseAttack += 3;
                level = 1;
                break;

            case "ChoirBoy":
                baseAttack -= 1;
                level += 0;
                xpModifier += .5;
                break;

            case "RockStar":
                baseAttack = 5;
                level = 4;
                xpModifier -= .3;
                break;
        }
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public double getXpModifier() {
        return xpModifier;
    }

    public int getLevel() {
        return level;
    }
}
