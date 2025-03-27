package bussniess;

import entity.Order;
import presentation.ShopManagement;
import value.inputOrderValue;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class OrderBusiness implements IOrderBusiness{
    @Override
    public void addOrder(Scanner scanner) {
        Order order = new Order();
        order.inputData(scanner);
        ShopManagement.orderList.add(order);
    }

    @Override
    public void displayOrders() {
        for(Order order : ShopManagement.orderList){
            System.out.println(order.toString());
        }
    }

    @Override
    public void updateOrderStatus(Scanner scanner) {
        while(true){
            System.out.print("Nhập vào id đơn hàng muốn cập nhật: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isFound = false;
            for(Order order : ShopManagement.orderList){
                if(order.getId() == id){
                    isFound = true;
                    order.setStatus(inputOrderValue.inputStatus(scanner));
                    break;
                }
            }
            if(!isFound){
                System.out.println("Không tìm thấy đơn hàng, vui lòng nhập lại: ");
            }
        }
    }

    @Override
    public List<Order> getOrderOverdue() {
        LocalDate today = LocalDate.now();
        List<Order> listOrderOverdue = ShopManagement.orderList.stream().filter(order -> !order.isStatus() &&
                order.getOrderDate().isBefore(today)).toList();
        return  listOrderOverdue;
    }

    @Override
    public List<Order> getOrderDelivied() {
        LocalDate today = LocalDate.now();
        return ShopManagement.orderList.stream().filter(order -> order.isStatus() &&
                order.getOrderDate().isBefore(today)).toList();
    }
    @Override
    public double getTotalRevenue(){
        double totalRevenue = 0;
        for(Order order : ShopManagement.orderList){
            totalRevenue+=order.getTotalAmount();
        }
        return totalRevenue;
    }
}
