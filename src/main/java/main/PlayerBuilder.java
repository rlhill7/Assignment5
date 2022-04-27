package main;

/**
 * Builder class for the main.Player
 * Uses builder design pattern
 */
public  class PlayerBuilder {
    public int level;
    public int baseAttack = 0;
    public int baseDefense = 0;
    public String playerRace;
    public String playerClass ;
    public String playerInstrument;
    public double xpModifier = 1.00;


    public PlayerBuilder(){
        super();
    }


    public PlayerBuilder level(int level) {
        this.level = level;
        return this;
    }

    public PlayerBuilder playerRace(String raceName){
        Race race = new Race(raceName);
        baseAttack += race.getBaseAttack();
        level += race.getLevel();
        playerRace = raceName;
        xpModifier += race.getXpModifier();
        baseDefense += race.getBaseDefence();
        return this;
    }

    public PlayerBuilder playerClass(String classInput){
        PlayerClass Class = new PlayerClass(classInput);
        baseAttack += Class.getBaseAttack();
        level += Class.getLevel();
        xpModifier += Class.getXpModifier();
        playerClass = classInput;
        return this;
    }

    public PlayerBuilder playerInstrument (String instrumentInput){
        Instrument instrument = new Instrument(instrumentInput);
        baseAttack += instrument.getBaseAttack();
        level += instrument.getLevel();
        xpModifier += instrument.getXpModifier();
        baseDefense += instrument.getBaseDefense();
        playerInstrument = instrumentInput;
        return this;
    }

    public Player build(){
        Player play = null;
        if (validatePLayer()){
            play = new Player(this);
        } else {
            System.out.println("Please provide required details");
        }
        return play;
    }

    private boolean validatePLayer(){
        return (level > -1 && playerRace != null &&playerInstrument != null && playerClass!= null);
    }
}
