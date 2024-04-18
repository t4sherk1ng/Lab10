package secondEx.weapon;

public class Staff extends BaseWeapon{

    private final int STAFF_DISTANCE = 3;

    public Staff(double power) {
        super(power);
    }

    @Override
    public int getDistance() {
        return STAFF_DISTANCE;
    }
}
