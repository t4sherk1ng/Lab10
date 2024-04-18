package secondEx.weapon;

public class Bow extends BaseWeapon{

    private final int BOW_DISTANCE = 5;

    public Bow(double power) {
        super(power);
    }

    @Override
    public int getDistance() {
        return BOW_DISTANCE;
    }
}
