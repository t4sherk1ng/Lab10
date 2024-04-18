package secondEx.items;

public abstract class BaseItem implements Item{

    protected int count;

    public BaseItem(int count) throws IllegalArgumentException {
        if (count >= MIN_VALUE && count <= MAX_VALUE) {
            this.count = count;
        } else {
            throw new IllegalArgumentException("Wrong value");
        }
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
