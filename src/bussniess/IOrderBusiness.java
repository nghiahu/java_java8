package bussniess;

import entity.Order;

import java.util.List;
import java.util.Scanner;

public interface IOrderBusiness {
    static void addOrder(Scanner scanner);
    static void displayOrders();
    static void updateOrderStatus(Scanner scanner);
    static List<Order> getOrderOverdue();
    static List<Order> getOrderDelivied();
    default double getTotalRevenue(){
       return 0;
    }
}
