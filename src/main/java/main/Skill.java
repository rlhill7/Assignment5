package main;

/**
 * Class for the skill system.
 */
public class Skill {
    public int skillId;
    int skillAttackModifier;

    public Skill pickSkill(int skillSeed){

        switch(skillSeed) {
            case 1:
                System.out.println("You have discovered. A chord of power, a...POWERCHORD. [when meter is full " +
                        "do double damage");
                skillAttackModifier = 2;
                break;

            case 2:
                System.out.println("You found the pick of destiny! All damage increased by 5");

            default :
                return null;
        }
    return this;
    }
}
