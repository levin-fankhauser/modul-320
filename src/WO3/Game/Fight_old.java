package WO3.Game;

public class Fight_old {

    private GameCharacter_old fighter1 = null;
    private GameCharacter_old fighter2 = null;
    private boolean gameOver = false;

    public Fight_old(GameCharacter_old fighter1, GameCharacter_old fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public void fight() {
        this.gameOver = false;
        while (fighter1.getHp() > 0 && fighter2.getHp() > 0) {

            this.fighter1.attack(this.fighter2);
            this.newRound();
            System.out.println("---");
        }
        gameOver = true;
    }

    private void newRound() {
        GameCharacter_old fighterChange = this.fighter1;
        this.fighter1 = fighter2;
        this.fighter2 = fighterChange;
    }

    public GameCharacter_old getWinner() {
        if (gameOver) {
            if (this.fighter1.getHp() > 0) {
                return fighter1;
            } else {
                return fighter2;
            }
        }
        return null;
    }
}
