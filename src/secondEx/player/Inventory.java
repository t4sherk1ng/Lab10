package secondEx.player;

import secondEx.items.Item;

public interface Inventory {

    final int ITEMS_COUNT = 5;

    boolean putInto(Item item, int place);

    boolean useItem(int place);
}
