package Transformers.Transformers;

import CarSimulation.Car;
import world.Monster;

public class Battle {

	private Transformer firstPlayer;
	private Transformer secondPlayer;

	public Battle(Transformer firstPlayer, Transformer secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public Transformer beat() {
		boolean bothAreNotDead = true;
		while (bothAreNotDead) {
			firstPlayer.attack(secondPlayer);
			secondPlayer.attack(firstPlayer);
			bothAreNotDead = firstPlayer.getPower() > 0 && secondPlayer.getPower() > 0;
		}

		return firstPlayer.isDead() ? secondPlayer : firstPlayer;
	}
	
	public static void main(String[] args) {
		Monster monstre1 = new Monster("calamar", 30);
		Monster monstre2 = new Monster("flipper", 30);
		Car car1 = new Car(7, 7);
		Car car2 = new Car(8, 6);
		Transformer transformer1 = new Transformer(car1, monstre1);
		Transformer transformer2 = new Transformer(car2, monstre2);
		Battle deathMatch = new Battle(transformer1, transformer2);
		
		System.out.println("Combat mortel opposant Calamar de puissance : " + transformer1.getPower() + " à Flipper de puissance : " + transformer2.getPower());
		System.out.println("Le vainqueur est : "+ deathMatch.beat().getMonster().getName());
			
		
	}

}
