package Theory.Inventory.CustomerInventory.ProducerInventory;

import Theory.Inventory.CustomerInventory.SellerInventory.SellerInventory;

public class ProducerInventory {
    public int i1 = 10, i2 = 10, i3 = 10;

    public void update(String item, int qty) {
        if(item.equals("Apple"))
            i1 = i1 - qty;
        else if(item.equals("Banana"))
            i2 = i2 - qty;
        else if(item.equals("Grapes"))
            i3 = i3 - qty;

        restock();
    }

    public void restock() {
        if(i1<3) {
            i1 = 20;
        }
        else if(i2<5) {
            i2 = 30;
        }
        else if(i3<5) {
            i3 = 30;
        }
    }
}
