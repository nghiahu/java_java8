package value;

import presentation.ShopManagement;

import java.util.Optional;
import java.util.Scanner;

public class inputCustomValue {
    public static int inputIdvalue(){
        int idCustomer = ShopManagement.customerList.size();
        return idCustomer;
    }

    public static String inputName(Scanner scanner){
        System.out.print("Nhập tên khách hàng: ");
        return scanner.nextLine();
    }
    public static Optional<String> inputEmail(Scanner scanner){
        System.out.print("Nhập email: ");
        return Optional.ofNullable(scanner.nextLine());
    }
}
