package secondEx.items;

public interface Item {

    final int MIN_VALUE = 1;
    final int MAX_VALUE = 10;

    int use();

    boolean isUsed();

}
