import java.util.ArrayList;
import java.util.List;

abstract class ShopAbstract {
    private List<Item> totalList;
    ShopAbstract(){
        totalList=new ArrayList<>();
    }
    public List<Item> getItems() {
        return totalList;
    }

    public void setItems(List<Item> items) {
        this.totalList = items;
    }
}
