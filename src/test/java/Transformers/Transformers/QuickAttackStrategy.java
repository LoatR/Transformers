package Transformers.Transformers;

public class QuickAttackStrategy implements Strategy {

	public void attack(Transformer striker, Transformer opponent) {
		double opponentPower = opponent.getPower();
		double strikerPower = striker.getPower();
		opponent.setPower(opponentPower - strikerPower * 0.3);
		striker.setPower(strikerPower - strikerPower * 0.1);
	}

}
