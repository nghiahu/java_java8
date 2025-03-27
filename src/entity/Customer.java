package entity;

import value.inputCustomValue;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    private int id;
    private String name;
    private Optional<String> email;

    public Customer() {
    }

    public Customer(int id, String name, Optional<String> email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    @Override
    public void inputData(Scanner scanner) {
        setId(inputCustomValue.inputIdvalue());
        setName(inputCustomValue.inputName(scanner));
        setEmail(inputCustomValue.inputEmail(scanner));
    }
    public String printEmail(){
        if(this.email.isPresent()){
            return this.email.get();
        }else {
            return "Không có email";
        }
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Email: " + printEmail();
    }
}
