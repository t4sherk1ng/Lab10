package secondEx.armor;

public class Helmet extends BaseArmor {

    private final int HELMET_POSITION = 3;

    public Helmet(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }
}
