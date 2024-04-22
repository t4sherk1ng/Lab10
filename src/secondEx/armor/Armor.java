package secondEx.armor;

public interface Armor {

    int MIN_VALUE = 5;
    int MAX_VALUE = 50;

    boolean isBroken();

    int destroyBy(int damage);

    int getPosition();
}
