package OOP_Course.RMS;


import java.util.Scanner;

public class Customer extends person{

    Scanner s = new Scanner(System.in);

    public Customer(){

    }

    public Customer(int id, String name, String email, String address, Long phoneNum) {
        super(id,name,email,address,phoneNum);

    }

}