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
        if (!isUsed()) {
            this.count = 0;
            return 1;
        }
        return 0;
    }

    @Override
    public boolean isUsed() {
        return this.count == 0;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ", " +
                "count: " + this.count + ", " +
                "isUsed: " + this.isUsed();
    }
}
