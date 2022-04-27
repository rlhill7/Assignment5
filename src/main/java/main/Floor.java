package main;

/**
 * main.Floor class to be used by floor mediator
 */
public class Floor {
    private int floorNumber = 0;
    private int levelNumber = 0;
    private int floorAttackPowerModifier;
    private int floorDefensePowerModifier;
    private double floorXpModifier;




    public int getFloorNumber(){
        return floorNumber;
    }

    public void changeFloorNumber(int floorModifier){
        floorNumber += floorModifier;
        System.out.println("You have moved to floor number " + floorNumber);
    }

    public int getLevelNumber(){
        return levelNumber;
    }

    public void changeLevelNumber(int levelModifier){
        levelNumber += levelModifier;
        System.out.println("You have moved to level number " + levelNumber);
    }

    public void getFloorMods(int floorModSeed){
        switch (floorModSeed) {
            case 1:
                System.out.println("You hear the echos of yyz around you, Neil Peart smiles upon you. +5 to" +
                        " attack power");
                floorAttackPowerModifier = 5;
                floorDefensePowerModifier = 0;
                floorXpModifier = 0;
                break;

            case 2:
                System.out.println("The heat of this floor has warped your instrument. Your defenses are weakened! " +
                        "-3 to defense");
                floorAttackPowerModifier = 0;
                floorDefensePowerModifier = -3;
                floorXpModifier = 0;
                break;

            case 3:
                System.out.println("You happen upon Dante who is having a nice visit in the underworld." +
                        " He shares with you what he knows. Double xp!");
                floorDefensePowerModifier = 0;
                floorAttackPowerModifier = 0;
                floorXpModifier = 1.00;
                break;
        }
    }

    public int getFloorAttackPowerModifier() {
        return floorAttackPowerModifier;
    }

    public int getFloorDefensePowerModifier() {
        return floorDefensePowerModifier;
    }

    public void setFloorDefensePowerModifier(int floorDefensePowerModifier) {
        this.floorDefensePowerModifier = floorDefensePowerModifier;
    }

    public double getFloorXpModifier() {
        return floorXpModifier;
    }

    public void setFloorXpModifier(double floorXpModifier) {
        this.floorXpModifier = floorXpModifier;
    }
}
