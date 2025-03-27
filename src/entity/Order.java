package entity;

import value.inputOrderValue;

import java.time.LocalDate;
import java.util.Scanner;

public class Order implements IApp {
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private boolean status;

    public Order() {
    }

    public Order(int id, Customer customer, LocalDate orderDate, double totalAmount, boolean status) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        setId(inputOrderValue.inputIdOrder());
        setCustomer(inputOrderValue.inputCustomer(scanner));
        setOrderDate(inputOrderValue.inputDateOrder(scanner));
        setTotalAmount(inputOrderValue.inputTotalAmount(scanner));
        setStatus(inputOrderValue.inputStatus(scanner));
    }
    @Override
    public String toString() {
        return "ID: " + id + " - Khách hàng: " + customer + " - orderDate: " + orderDate + " - totalAmount: " + totalAmount + " - status: " + status;
    }
}
