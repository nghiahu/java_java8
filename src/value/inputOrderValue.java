package value;

import entity.Customer;
import presentation.ShopManagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inputOrderValue {
    public static int inputIdOrder() {
        int idOrder = ShopManagement.orderList.size();
        return idOrder;
    }
    public static Customer inputCustomer(Scanner scanner) {
        while (true){
            System.out.print("Nhập id khách hàng");
            int idCustomer = Integer.parseInt(scanner.nextLine());
            for(Customer customer : ShopManagement.customerList){
                if(customer.getId() == idCustomer){
                    return customer;
                }
            }
            System.out.println("Không tồn tại khách hàng này vui lòng nhập lại: ");
        }
    }
    public static LocalDate inputDateOrder(Scanner scanner) {
        while (true){
            System.out.println("Nhập vào ngày đặt hàng(yyyy/MM/dd): ");
            String date = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.parse(date, formatter);
            if(localDate.isBefore(LocalDate.now())){
                return localDate;
            }
            System.out.println("Ngày nhập vào không hợp lệ vui lòng nhập lại");
        }
    }
    public static double inputTotalAmount(Scanner scanner) {
        System.out.print("Nhập vào tổng giá trị đơn hàng: ");
        double totalAmount = Double.parseDouble(scanner.nextLine());
        return totalAmount;
    }
    public static boolean inputStatus(Scanner scanner) {
        while(true){
            System.out.print("Nhập vào trạng thái: ");
            String status = scanner.nextLine();
            if(status.equals("true")){
                return true;
            } else if (status.equals("false")) {
                return false;
            }else {
                System.out.println("Trạng thái nhập vào không hợp lệ vui lòng nhập lại!");
            }
        }
    }
}
