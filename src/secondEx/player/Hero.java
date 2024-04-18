package secondEx.player;

import secondEx.armor.Armor;
import secondEx.items.Item;
import secondEx.weapon.Weapon;

public abstract class Hero implements Player, Healthy, Equipment, Inventory{

    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes;
    protected Item[] items;

    public Hero(String username, int health) {
        this.username = username;
        this.health = health;
    }

    private void loseHealth(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean change(Weapon weapon) {
        return false;
    }

    @Override
    public void dress(Armor armor) {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public void recoverHealth(int amount) {
        this.health += amount;
    }

    @Override
    public boolean putInto(Item item, int place) {
        return false;
    }

    @Override
    public boolean useItem(int place) {
        return false;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public abstract int damage(int damage);

    @Override
    public abstract boolean action(Player player, int distance);
}
