package secondEx.player;

public class Barbarian extends Hero{
    private final int MAX_STRENGTH = 100;
    private final int BARBARIAN_FORCE = 10;
    private int strength;
    private int forcePower = 1;

    public Barbarian(String username, int health, int strength) {
        super(username, health);
        this.strength = strength;
    }

    @Override
    public int damage(int damage) {
        return 0;
    }

    @Override
    public boolean action(Player player, int distance) {

    }

    @Override
    public boolean useItem(int place) {
        return super.useItem(place);
    }
}
