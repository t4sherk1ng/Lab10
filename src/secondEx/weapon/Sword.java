package secondEx.weapon;

public class Sword extends BaseWeapon{

    private final int SWORD_DISTANCE = 2;

    public Sword(double power) {
        super(power);
    }

    @Override
    public int getDistance() {
        return SWORD_DISTANCE;
    }
}
