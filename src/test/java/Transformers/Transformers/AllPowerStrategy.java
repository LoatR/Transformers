package Transformers.Transformers;

public class AllPowerStrategy implements Strategy  {

	@Override
	public void attack(Transformer striker, Transformer opponent) {
		double opponentPower = opponent.getPower();
		double strikerPower = striker.getPower();
		opponent.setPower(opponentPower-strikerPower);
		striker.setPower(strikerPower - strikerPower*0.5);
	}

}
