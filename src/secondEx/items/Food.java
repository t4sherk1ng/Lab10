package secondEx.items;

public class Food extends BaseItem{
    public Food(int count) throws IllegalArgumentException {
        super(count);
    }

    @Override
    public int use() {
        return 0;
    }

    @Override
    public boolean isUsed() {
        return false;
    }
}
