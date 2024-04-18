package secondEx.armor;

public class Dress extends BaseArmor{

    private final int HELMET_POSITION = 2;

    public Dress(int durability) {
        super(durability);
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public int destroyBy(int characterID) {
        return 0;
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }

    @Override
    public String toString() {
        return null;
    }
}
