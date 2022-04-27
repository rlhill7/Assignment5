package main;

import java.util.HashMap;
import java.util.Map;

/**
 * main.Player class
 * @author Russell Hill
 */
public class Player {

    //default player parameters
    private int healthPoints = 100;
    private int level;
    private String playerRace;
    private String playerClass;
    private String playerInstrument;
    private double xp;
    private double xpModifier;
    private int baseAttack;
    private int baseDefence;
    private int speed = 10;
    private int skillMeter = 0;
    public Map<Integer, Skill> skills = new HashMap<>();

    /**
     * builder for the player using the builder design pattern.
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

    public int getPlayerLevel() {
        return level;
    }

    /**
     * Method for leveling the player up.
     */
    public void levelUp() {
        RandomNumberGenerator ran = new RandomNumberGenerator();
        int skillSeed = ran.randomNumberGenerator(0,10);
        Skill skill = new Skill();
        if (skills.get(skillSeed) == null) {
            skill.pickSkill(skillSeed);
            skills.put(skillSeed, skill);
        }
        level += 1;
        xp = 0;
        baseAttack += 1;
        baseDefence += 1;
        speed += 1;
        healthPoints += 50;
        if (healthPoints > 100) {
            healthPoints = 100;
        }
        System.out.println("**Level up! You are now level " + level
                + " Attack defence and speed increased by 1**");
    }

    public String getPlayerRace() {
        return playerRace;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public String getPlayerInstrument() {
        return playerInstrument;
    }

    public double getXp() {
        return xp;
    }

    public void changeXp(double xpModifier) {
        xp += xpModifier;
    }

    public void resetXp() {
        xp = 0;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void changeHealthPoints(int healthDifference) {
        healthPoints += healthDifference;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int attackModifier) {
        baseAttack += attackModifier;
    }

    public int getBaseDefence() {
        return baseDefence;
    }

    public double getXpModifier() {
        return xpModifier;
    }

    public void setXpModifier(double xpModified) {
        xpModifier = xpModified;
    }

    public void setBaseDefence(int defenceModifier) {
        baseDefence += defenceModifier;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("main.Player [player level is: ").append(level)
                .append(", race is: ").append(playerRace)
                .append(", class is: ").append(playerClass).append(", instrument is: ")
                .append(playerInstrument).append(", xp modifier is: ").append(xpModifier)
                .append(", base attack is: ")
                .append(baseAttack).append(", base defence is: ").append(baseDefence)
                .append(", healthpoints remaining: ").append(healthPoints).append("]");
        return builder.toString();
    }


    public int getSkillMeter() {
        return skillMeter;
    }

    public void setSkillMeter(int skillMeterModifier) {
        skillMeter = skillMeterModifier;
    }

    public void changeSkillMeter(int skillMeterModifier) {
        skillMeter += skillMeterModifier;
    }
}
