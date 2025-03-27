package presentation;

import bussniess.CustomerBusiness;
import bussniess.OrderBusiness;
import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Order> orderList = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*******************************SHOP MENU****************************");
            System.out.println("1. Quản lý khác hàng");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean EXit = false;
                    do {
                        System.out.println("****************************CUSTOMER MENU***********************");
                        System.out.println("1. Danh sách khách hàng");
                        System.out.println("2. Thêm mới khách hàng");
                        System.out.println("3. Thoát");
                        System.out.print("Lựa chọn của bạn: ");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                CustomerBusiness.displayCustomers();
                                break;
                            case 2:
                                CustomerBusiness.addCustomer(scanner);
                                break;
                            case 3:
                                EXit = true;
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại");
                        }
                    }while (!EXit);
                    break;
                case 2:
                    EXit = false;
                    do {
                        System.out.println("****************************ORDER MENU***********************");
                        System.out.println("1. Danh sách đơn hàng");
                        System.out.println("2. Thêm mới đơn hàng");
                        System.out.println("3. Cập nhật trạng thái đơn hàng");
                        System.out.println("4. Danh sách đơn hàng quá hạn");
                        System.out.println("5. Thống kê số lượng đơn hàng đã giao");
                        System.out.println("6. Tính tổng doanh thu các đơn hàng đã giao");
                        System.out.println("7. Thoát");
                        System.out.print("Lựa chọn của bạn: ");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                OrderBusiness.displayOrders();
                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                System.exit(0);
                            default:
                                System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại!");
                        }
                    }while (!EXit);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại!");
            }
        }while (true);
    }
}
