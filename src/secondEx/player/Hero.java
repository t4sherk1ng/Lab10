package secondEx.player;

import secondEx.armor.Armor;
import secondEx.items.Item;
import secondEx.weapon.Weapon;

import java.util.Arrays;

public abstract class Hero implements Player, Healthy, Equipment, Inventory {

    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes = new Armor[CLOTHES_COUNT];
    protected Item[] items = new Item[ITEMS_COUNT];

    public Hero(String username, int health) {
        if (username != null && !username.isBlank()) {
            this.username = username;
        } else {
            throw new IllegalArgumentException("Wrong username");
        }
        if (health > 0 && health <= MAX_HEALTH) {
            this.health = health;
        } else {
            throw new IllegalArgumentException("Wrong health value");
        }
    }

    private void loseHealth(int damage) {
        if (damage > 0) {
            if (damage > health && !isDead()) {
                health = 0;
            } else {
                this.health -= damage;
            }
        }
    }

    @Override
    public void dress(Armor armor) {
        clothes[armor.getPosition()-1] = armor;
    }

    @Override
    public boolean isDead() {
        return health == 0;
    }

    @Override
    public void recoverHealth(int amount) {
        this.health += amount;
    }

    @Override
    public boolean putInto(Item item, int place) {
        items[place] = item;
        return true;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public int damage(int damage) {
        loseHealth(damage);
        return damage;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " + this.getUserName() + ", " +
                "health: " + this.health + ", " +
                "weapon: " + (weapon == null ? "no" : this.weapon.toString()) + ", " +
                "inventory: " + (items == null ? "no" : Arrays.stream(items).map(Item::toString).reduce(" ", String::concat));

    }

    @Override
    public abstract boolean action(Player player, int distance);

    @Override
    public abstract boolean useItem(int place);

    @Override
    public abstract boolean change(Weapon weapon);
}
