package WO3.Game.renewed;

public class FightArena {

    public static void main(String[] args) {
        GameCharacter fighter1 = new GameCharacter("David", 30, 60);
        GameCharacter fighter2 = new GameCharacter("Goliath", 100, 20);

        Fight fight = new Fight(fighter1, fighter2);
        fight.start();

        if (fight.getWinner() != null) {
            System.out.println(fight.getWinner().getName() + " hat den Kampf gewonnen.");
        }
    }
}
