package WO6.Interfaces;

public class Tester {

	public static void main(String[] args) {

		Character char1 = new Character("Zenturon", 100, 20);
		Character char2 = new Character("Valarian", 100, 20);

		char2.setWeapon(new Dagger());

		Fight game = new Fight(char1, char2);
		game.fight();

		Character winner = game.getWinner();
		if (winner != null) {
			System.out.println(winner.getName() + " hat den Kampf gewonnen.");
		}
	}

}
