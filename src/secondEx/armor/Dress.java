package secondEx.armor;

public class Dress extends BaseArmor{

    private final int HELMET_POSITION = 2;

    public Dress(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }
}
