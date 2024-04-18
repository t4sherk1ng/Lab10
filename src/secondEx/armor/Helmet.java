package secondEx.armor;

public class Helmet extends BaseArmor{

    private final int HELMET_POSITION = 3;

    public Helmet(int durability) {
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
