package secondEx.player;

public interface Healthy {

    final int MAX_HEALTH = 100;

    boolean isDead();

    void recoverHealth(int amount);
}