package secondEx.player;

import secondEx.weapon.Weapon;

public class Barbarian extends Hero{
    private final int MAX_STRENGTH = 100;
    private final int BARBARIAN_FORCE = 10;
    private int strength;
    private int forcePower = 1;

    public Barbarian(String username, int health, int strength) {
        super(username, health);
        this.strength = strength;
    }

    @Override
    public boolean action(Player player, int distance) {
        if (strength == 0 || distance != 1) {
            return false;
        } else {
            strength -= forcePower;
            player.damage(BARBARIAN_FORCE * strength);
            return true;
        }
    }


    @Override
    public boolean useItem(int place) {
        if (this.items[place] != null && !this.items[place].isUsed()) {
            this.items[place].use();
            return true;
        }
        return false;
    }

    @Override
    public boolean change(Weapon weapon) {
        return false;
    }
}
