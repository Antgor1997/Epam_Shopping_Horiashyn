import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wife wife=new Wife();
        Husband husband=new Husband();
        ElectricityShop electricityShop=new ElectricityShop();
        FoodShop foodShop=new FoodShop();

        List<Item> currentElectricityItems=new ArrayList<>();
        currentElectricityItems.add(new Item("Lenovo", 124.99));
        currentElectricityItems.add(new Item("Apple", 499.99));
        currentElectricityItems.add(new Item("Xiaomi", 99.99));
        currentElectricityItems.add(new Item("Dell", 199.99));
        currentElectricityItems.add(new Item("Acer", 189.99));
        electricityShop.setItems(currentElectricityItems);

        List<Item> currentFood=new ArrayList<>();
        currentFood.add(new Item("Onion", 4.49));
        currentFood.add(new Item("Mineral water", 1.99));
        currentFood.add(new Item("Coockies", 5.99));
        currentFood.add(new Item("Meet", 25.99));
        foodShop.setItems(currentFood);

        ArrayList<String> neededItemsList=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        String checkFinish="";
        while (!checkFinish.equals("No")&&!checkFinish.equals("no")){
            System.out.print("Please enter the name of element, that you want to add to the list: ");
            neededItemsList.add(in.next());

            System.out.println("Do you want to add something else to the list of searching items?");
            System.out.print("Print Yes or No: ");
            checkFinish=in.next();
            while (!checkFinish.equals("Yes")&&!checkFinish.equals("No")&&!checkFinish.equals("yes")&&!checkFinish.equals("no")){
                System.out.println("Wrong parameters! Try again!");
                System.out.print("Print Yes or No: ");
                checkFinish=in.next();
            }
        }

        wife.setNeededItems(neededItemsList);

        husband.setBucket(electricityShop, wife.getNeededItems());
        husband.setBucket(foodShop, wife.getNeededItems());

        System.out.println("Total List: ");
        for (Item item:electricityShop.getItems()){
            System.out.println("Name: "+item.name+", cost: "+item.cost);
        }
        for (Item item:foodShop.getItems()){
            System.out.println("Name: "+item.name+", cost: "+item.cost);
        }

        System.out.println("Bought List: ");
        for (Item item:husband.getBucket()){
            System.out.println("Name: "+item.name+", cost: "+item.cost);
        }
        double totalPrice=husband.totalPrice();

        System.out.print("Total Price: "+totalPrice);
    }
}