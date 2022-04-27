package main;

/**
 * Class for the skill system.
 */
public class Skill {

    int skillAttackModifier;

    /**
     * Picks the skill.
     * @param skillSeed The skill to be chosen
     * @return the chosen skill.
     */
    public Skill pickSkill(int skillSeed) {

        switch (skillSeed) {
            case 1:
                System.out.println("You have discovered. A chord of power,"
                        + " a...POWERCHORD. [when meter is full "
                        + "do double damage");
                skillAttackModifier = 2;
                break;

            case 2:
                System.out.println("You found the pick of destiny! All damage increased by 5");
                break;

            default :
                return null;
        }
        return this;
    }
}
