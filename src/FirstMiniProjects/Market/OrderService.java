package FirstMiniProjects.Market;

public class OrderService {

    private final double totalPrice;

    public OrderService (Basket basketWithProducts) {
        this.totalPrice = computingTotalPrice(basketWithProducts);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private static double computingTotalPrice(Basket basketWithProducts) {
//        return basketWithProducts.getAllProducts().stream().collect(Collectors.summingDouble(product -> product.getPriceOfProduct() * product.getQuantity()));
   double result = basketWithProducts.getAllProducts().keySet().stream().mapToDouble(key -> key.getPriceOfProduct() * key.getQuantity()).sum();
   basketWithProducts.cleanTheBasket();
   return result;
    }
}
