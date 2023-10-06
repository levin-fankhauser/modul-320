package WO3.Game.renewed;

public class Fight {

    private GameCharacter fighter1 = null;
    private GameCharacter fighter2 = null;
    private boolean terminated = false;

    public Fight(GameCharacter fighter1, GameCharacter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public void start() {
        this.terminated = false;
        while (!terminated) {
            fighter1.attack(fighter2);
            if (fighter2.getHp() <= 0) {
                terminated = true;
                break;
            }

            GameCharacter changeFighter = fighter1;
            fighter1 = fighter2;
            fighter2 = changeFighter;
        }
    }

    public GameCharacter getWinner() {
        if (terminated) {
            return fighter1.getHp() > 0 ? fighter1 : fighter2;
        }
        return null;
    }
}
