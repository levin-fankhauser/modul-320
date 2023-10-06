package WO3.Game;

public class GameCharacter_old {

    private String name;
    private int hp;
    private int ap;

    public GameCharacter_old(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    private void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void attack(GameCharacter_old enemy) {
        int hit = (int) (this.ap * Math.random());
        enemy.setHp(enemy.getHp() - hit);

        System.out.println(this.name + " hit " + enemy.name + " with " + hit);
        this.output(this);
        this.output(enemy);
    }

    private void output(GameCharacter_old character) {
        System.out.println(character.getName() + ": " + "hp=" + character.getHp());
    }
}
