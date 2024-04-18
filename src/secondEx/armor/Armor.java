package secondEx.armor;

public interface Armor {

    final int MIN_VALUE = 5;
    final int MAX_VALUE = 50;

    boolean isBroken();

    int destroyBy(int characterID);

    int getPosition();
}
