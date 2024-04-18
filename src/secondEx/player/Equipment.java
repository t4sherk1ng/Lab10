package secondEx.player;

import secondEx.armor.Armor;
import secondEx.weapon.Weapon;

public interface Equipment {

    final int CLOTHES_COUNT = 3;

    boolean change(Weapon weapon);

    void dress(Armor armor);
}
