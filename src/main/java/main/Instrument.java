package main;

public class Instrument {

    private String instrumentName = "";
    private int baseAttack = 0;
    private double xpModifier = 0;
    private int level = 0;
    private int baseDefense = 0;

    public Instrument(String instrumentInput){
        this.instrumentName = instrumentInput;

        switch (instrumentInput) {
            case "Spoons":
                xpModifier += .3;
                break;

            case "Cello":
                baseAttack += 4;
                baseDefense +=2;
                break;

            case "Guitar":
                baseAttack += 5;

                baseDefense += 1;
                break;

            case "Piano":
                baseAttack += 3;
                baseDefense +=5;
                xpModifier += .2;
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
    public int getBaseDefense(){
        return baseDefense;
    }
}
