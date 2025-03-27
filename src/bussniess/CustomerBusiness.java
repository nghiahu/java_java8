package bussniess;

import entity.Customer;
import presentation.ShopManagement;

import java.util.Scanner;

public class CustomerBusiness {
    public static void addCustomer(Scanner scanner){
        Customer customer = new Customer();
        customer.inputData(scanner);
        ShopManagement.customerList.add(customer);
    }
    public static void displayCustomers(){
        for(Customer customer : ShopManagement.customerList){
            System.out.println(customer.toString());
        }
    }
}
