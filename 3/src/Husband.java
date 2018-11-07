import java.util.ArrayList;

class Husband {
    private ArrayList<Item> bucket;
    Husband(){
        bucket=new ArrayList<>();
    }
    public double totalPrice(){
        double totalPrice=0;
        for(Item item:bucket){
            totalPrice+=item.cost;
        }
        return totalPrice;
    }
    public ArrayList<Item> getBucket() {
        return bucket;
    }
    public void setBucket(ShopAbstract shop, ArrayList<String> neededItems) {
        for (String needed_item:neededItems){
            for(Item item:shop.getItems()){
                if (needed_item.equals(item.name)){
                    this.bucket.add(item);
                }
            }
        }
    }
}