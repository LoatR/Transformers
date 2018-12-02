package Transformers.Transformers;

public class Battle {

	private Transformer firstPlayer;
	private Transformer secondPlayer;

	public Battle(Transformer firstPlayer, Transformer secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public Transformer beat() {
		while (!firstPlayer.isDead() || !secondPlayer.isDead()) {
			firstPlayer.attack(secondPlayer);
			secondPlayer.attack(firstPlayer);
		}
		return firstPlayer.isDead() ? firstPlayer : secondPlayer;
	}

}
