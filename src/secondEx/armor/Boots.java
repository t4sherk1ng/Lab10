package secondEx.armor;

public class Boots extends BaseArmor{

    private final int HELMET_POSITION = 1;

    public Boots(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }
}
