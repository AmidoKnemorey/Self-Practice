package StudyingProcess.Market;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws LackOfQuantityException {

        Basket mainBasket = new Basket();

        Product product1 = new GenericProduct(() -> 15.5, (LocalDate) -> LocalDate.isAfter(java.time.LocalDate.of(2002,12,30)), "Cucumber");
        Product product2 = new GenericProduct(() -> 12.03, (LocalDate) -> LocalDate.isBefore(java.time.LocalDate.now()), "Tea");
        Product product3 = new GenericProduct(() -> 17.89, (LocalDate) -> LocalDate.isEqual(java.time.LocalDate.now()),"Bread");

        mainBasket.addProductToBasket(product1);
        mainBasket.addProductToBasket(product2);
        mainBasket.addProductToBasket(product3);

        product3.increaseQuantity(4);

        product3.decreaseQuantity(2, mainBasket);

        for(Product product : mainBasket.getAllProducts().keySet()) {
            System.out.printf("%nProduct %s, %d pcs. which costs %f, and it's availability: %s.", product.getTitle(), product.getQuantity(),
                    product.getPriceOfProduct(), product.isProductAvailable(LocalDate.of(2022,1,3)));
        }

        OrderService orderService = new OrderService(mainBasket);

        System.out.print("\n"+orderService.getTotalPrice());

        System.out.println(mainBasket.getAllProducts());

    }
}