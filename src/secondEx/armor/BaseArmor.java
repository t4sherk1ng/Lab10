package secondEx.armor;

public abstract class BaseArmor implements Armor {

    protected int durability;

    public BaseArmor(int durability) throws IllegalArgumentException{
        if (durability >= MIN_VALUE && durability <= MAX_VALUE) {
            this.durability = durability;
        } else {
            throw new IllegalArgumentException("Wrong value");
        }
    }

    @Override
    public boolean isBroken() {
        return this.durability == 0;
    }

    @Override
    public int destroyBy(int damage) {
        if (isBroken() || durability < damage) {
            return 0;
        } else {
            this.durability -= damage;
            return this.durability;
        }
    }

    @Override
    public abstract int getPosition();

    @Override
    public String toString() {
        return this.getPosition() + ": " + this.getClass().getName() + ", " +
                "durability: " + this.durability + ", " +
                "isBroken: " + isBroken();
    }
}
