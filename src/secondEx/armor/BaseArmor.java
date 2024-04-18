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
    public abstract boolean isBroken();

    @Override
    public abstract int destroyBy(int characterID);

    @Override
    public abstract int getPosition();

    @Override
    public abstract String toString();
}
