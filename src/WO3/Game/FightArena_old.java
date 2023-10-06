package WO3.Game;

public class FightArena_old {

    public static void main(String[] args) {

        GameCharacter_old fighter1 = new GameCharacter_old("David", 30, 60);
        GameCharacter_old fighter2 = new GameCharacter_old("Goliath", 100, 20);

        Fight_old game = new Fight_old(fighter1, fighter2);
        game.fight();

        GameCharacter_old winner = game.getWinner();
        if (winner != null) {
            System.out.println(winner.getName() + " has won the fight.");
        }
    }

}
