package com.gla.collections;
import java.util.*;
class Order {
    int orderId;
    String customerName;
    double amount;
    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return this.orderId == order.orderId;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(orderId);
    }
    @Override
    public String toString() {
        return orderId + " | " + customerName + " | " + amount;
    }
}
class OrderSystem {
    List<Order> orderList = new ArrayList<>();
    Set<Order> uniqueOrders = new HashSet<>();
    Queue<Order> processingQueue = new LinkedList<>();
    Stack<Order> failedStack = new Stack<>();
    public void addOrder(Order o) {
        orderList.add(o);
    }
    public void removeDuplicates() {
        uniqueOrders.addAll(orderList);
        System.out.println("Unique Orders:");
        for (Order o : uniqueOrders) {
            System.out.println(o);
        }
    }
    public void loadQueue() {
        processingQueue.addAll(uniqueOrders);
    }
    public void processOrders() {
        System.out.println("\nProcessing Orders:");
        while (!processingQueue.isEmpty()) {
            Order current = processingQueue.poll();
            if (current.amount > 5000) {
                System.out.println("Failed: " + current);
                failedStack.push(current);
            } else {
                System.out.println("Processed: " + current);
            }
        }
    }
    public void retryFailedOrders() {
        System.out.println("\nRetrying Failed Orders:");

        while (!failedStack.isEmpty()) {
            Order o = failedStack.pop();
            System.out.println("Reprocessed: " + o);
        }
    }
}
public class ECommerceOrderProcessingSystem {
    public static void main(String[] args) {
        OrderSystem system = new OrderSystem();
        system.addOrder(new Order(1, "Akshat", 2000));
        system.addOrder(new Order(2, "Rahul", 6000));
        system.addOrder(new Order(3, "Amit", 3000));
        system.addOrder(new Order(1, "Duplicate", 2000));
        system.removeDuplicates();
        system.loadQueue();
        system.processOrders();
        system.retryFailedOrders();
    }
}
