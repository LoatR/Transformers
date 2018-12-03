package Transformers.Transformers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import world.Monster;
import CarSimulation.Car;

public class BattleTest {

	private Battle battle;
	private Transformer theRock;
	private Transformer gollum;

	private Car carRock;
	private Monster monsterRock;

	private Car carGollum;
	private Monster monsterGollum;

	public void createTest() {
		this.carRock = new Car(40, 440);
		this.monsterRock = new Monster("rocky", 2.40);
		this.theRock = new Transformer(this.carRock, this.monsterRock);
		this.carGollum = new Car(10, 110);
		this.monsterGollum = new Monster("gummy", 0.70);
		this.gollum = new Transformer(this.carGollum, this.monsterGollum);

		assertNotNull(this.theRock);
		assertNotNull(this.gollum);
	}

	public void createBattle() {
		this.battle = new Battle(this.theRock, this.gollum);
		assertNotNull(this.battle);
	}

	public void beatTest() {
		Transformer winner = this.battle.beat();
		assertEquals(winner, this.theRock);
		assertTrue(winner.getPower() > 0);
	}

}