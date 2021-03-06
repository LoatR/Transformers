package Transformers.Transformers;

import CarSimulation.Car;
import world.Monstre;

public class Transformer {

	private Car car;
	private Monstre monster;
	private double power;

	public Transformer(Car c, Monstre m) {
		this.car = c;
		this.monster = m;
		this.power = m.getHeight() * c.getCapacite();
	}

	public Car getVoiture() {
		return car;
	}

	public void setVoiture(Car voiture) {
		this.car = voiture;
	}

	public Monstre getMonster() {
		return monster;
	}

	public void setMonster(Monstre monster) {
		this.monster = monster;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void attack(Transformer opponent) {
		if(opponent.getPower() > this.getPower()) {
			QuickAttackStrategy strategy = new  QuickAttackStrategy();
			strategy.attack(this, opponent);
		} else {
			AllPowerStrategy strategy = new  AllPowerStrategy();
			strategy.attack(this, opponent);
		}
	}

	public boolean isDead() {
		return this.getPower() <= 0;
	}
}
