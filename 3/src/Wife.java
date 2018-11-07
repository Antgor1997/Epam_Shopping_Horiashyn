import java.util.ArrayList;

class Wife {
    private ArrayList<String> neededItems;
    Wife(){
        neededItems=new ArrayList<>();
    }

    public ArrayList<String> getNeededItems() {
        return neededItems;
    }

    public void setNeededItems(ArrayList<String> neededItems) {
        this.neededItems = neededItems;
    }
}