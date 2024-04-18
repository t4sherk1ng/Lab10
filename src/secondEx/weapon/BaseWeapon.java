package secondEx.weapon;

public abstract class BaseWeapon implements Weapon {

    protected double power;

    public BaseWeapon(double power) throws IllegalArgumentException {
        if (power >= MIN_VALUE && power <= MAX_VALUE) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("Wrong value");
        }
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public abstract int getDistance();
}
