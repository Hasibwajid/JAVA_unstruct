package OOP_Course.RMS;

import java.util.Scanner;

/**
 *
 * @author corpsed
 */
public class Employee extends person{
    Scanner s = new Scanner(System.in);

    public Employee(int id, String name, String email, String address, Long phoneNum) {
        super(id,name,email,address,phoneNum);
    }

    public Employee() {
    }

}