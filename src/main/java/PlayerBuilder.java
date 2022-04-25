public  class PlayerBuilder {
    int level;
    Race playerRace;
    Class playerClass ;
    Instrument playerInstrument;

    public PlayerBuilder(){
        super();
    }
    public PlayerBuilder level(int level) {
        this.level = level;
        return this;
    }

    public PlayerBuilder playerRace(Race race){
        this.playerRace =  race;
        return this;
    }

    public PlayerBuilder playerClass(Class playerClass){
        this.playerClass = playerClass;
        return this;
    }

    public PlayerBuilder playerInstrument (Instrument playerInstrument){
        this.playerInstrument = playerInstrument;
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
