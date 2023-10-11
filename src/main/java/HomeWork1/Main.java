package HomeWork1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotVendingMashine HVM = new HotVendingMashine();
        HVM.initProductName(List.of(new HotDrinks("Coffee", 240, 300, 50), (new HotDrinks("Tea", 200, 150, 40))));
        System.out.println(HVM.getProductName());
    }
}
