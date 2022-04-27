package test;

import main.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CombatUnitTests {


    Player playerTest1;
    Player playerTestOrc;
    Player playerTestVictory;

    PlayerBuilder builder1;
    PlayerBuilder builder2;
    PlayerBuilder builder3;

    Enemy enemy1;
    Enemy enemyBoss;
    Combat combat1;

    FloorMediator floorMediatorVictory;

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


            builder3 = new PlayerBuilder();
            builder3.level = 1;
            builder3.playerRace("Elf");
            builder3.playerInstrument("Piano");
            builder3.playerClass("RockStar");
            playerTestVictory = new Player(builder3);
            builder3.build();


            EnemyFactory enemyFactory1 = new EnemyFactory();
            BattleMediator battleMediator1 = new BattleMediator();
            combat1 = new Combat();
            enemy1 = enemyFactory1.createEnemy("main.EnemyNormal");
            enemyBoss = enemyFactory1.createEnemy("main.EnemyBoss");
            floorMediatorVictory = new FloorMediator();

        }
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void battleMediator_Player_Attack() {

        combat1.basicAttackPlayer(playerTest1, enemy1);
        assertEquals(8, enemy1.getHealthPoints());
    }
    @Test
    public void battleMediator_Enemy_Attack() {
        combat1.basicAttackEnemy(playerTest1, enemy1);
        assertEquals(98, playerTest1.getHealthPoints());
    }

    @Test
    public void floorMediator_Vitory(){
        floorMediatorVictory.runGame(playerTestVictory);
        assertEquals(100,playerTestVictory.getHealthPoints());
    }

    @Test
    public void toString_enemyNormal(){
        assertEquals("Normal Enemy [Enemy level is: 1, base attack is: 2, base defence is: 0, rep: 10]",enemy1.toString());
    }
    @Test
    public void toString_enemyBoss(){
        assertEquals("Enemy Boss [Boss level is: 5, base attack is: 10, base defence is: 10, rep remaining: 50]",enemyBoss.toString());
    }
}
