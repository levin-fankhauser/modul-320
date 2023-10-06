package WO3.Game.renewed;

public class GameCharacter {

    private String name;
    private int hp;
    private int ap;

    public GameCharacter(String name, int hp, int ap) {
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

    /**
     * Gets the HP from the Character
     * @return HP from Character
     * @author Levin Fankhauser
     */
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

    public void attack(GameCharacter enemy) {
        int hit = (int) (this.ap * Math.random());
        enemy.setHp(enemy.getHp() - hit);

        System.out.println(this.name + " trifft " + enemy.name + " mit " + hit);
        this.printStatus();
        enemy.printStatus();
        System.out.println("***************************************************");
    }

    public void printStatus() {
        System.out.println(this.name + ": " + "hp=" + this.hp);
    }
}
