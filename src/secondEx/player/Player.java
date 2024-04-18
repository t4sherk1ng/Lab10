package secondEx.player;

public interface Player {

    String getUserName();

    int damage(int damage);

    boolean action(Player player, int distance);
}
