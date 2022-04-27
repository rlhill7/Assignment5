package test;

import main.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;


public class PlayerUnitTests {


    Player playerTest1;
    Player playerTestOrc;



    PlayerBuilder builder1;
    PlayerBuilder builder2;

    @Before
    public void setUp() throws Exception {
        {

            builder1 = new PlayerBuilder();
            builder1.level = 1;
            builder1.playerRace("Human");
            builder1.playerInstrument("Spoons");
            builder1.playerClass("Bard");
            playerTest1 = new Player(builder1);
            builder1.build();

            builder2 = new PlayerBuilder();
            builder2.level = 1;
            builder2.playerRace("Orc");
            builder2.playerInstrument("Cello");
            builder2.playerClass("ChoirBoy");
            playerTestOrc = new Player(builder2);
            builder2.build();

        }
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void playerBuilder_human_spoons_bard(){
        assertEquals(1,playerTest1.getPlayerLevel());
    }

    @Test
    public void playerBuilder_orc_cello_choirboy(){
        assertEquals(100,playerTestOrc.getHealthPoints());
    }

    @Test
    public void player_levelUp(){
        playerTest1.levelUp();
        assertEquals(2,playerTest1.getPlayerLevel());
    }
}
