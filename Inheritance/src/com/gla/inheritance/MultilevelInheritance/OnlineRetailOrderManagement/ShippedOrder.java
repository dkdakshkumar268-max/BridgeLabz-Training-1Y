class ShippedOrder extends Order {
    String trackingNumber;

    String getOrderStatus() {
        return "Shipped";
    }
}
