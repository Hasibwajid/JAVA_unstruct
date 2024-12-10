package CodewithHarry;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//package CodewithHarry;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
////        Create a class of “Employee_info” with following parameters (Emp_ID,
////        Emp_name, Dept, Salary). [10 Marks]
////        Write a user defined function EMP_Data (for data input of 10 Employees) with
////        object of “Employee_info” as parameter. [10 Marks]
////        Store this information in array of “Employee_info” type. [10 Marks]
////        Write a user defined function to write the list of employees having salary
////        greater than Rs10,000/- in file named “employee.txt”
//
//
 class Employee_info{
    Scanner s = new Scanner( System.in);
    int Emp_ID;
    String Emp_name;
    int dept;
    int salary;
    Employee_info[] eI = new Employee_info[2];


    void EMP_Data(Employee_info e){
        for (int i = 0 ; i< eI.length; i++){
            System.out.println("emter id:");
            int id = s.nextInt();
            System.out.println("emter Emp_name:");
            String name = s.nextLine();
            s.nextLine();
            System.out.println("emter dept:");
            int dpt = s.nextInt();
            System.out.println("emter salary:");
            int sal = s.nextInt();
            e.Emp_name = name;
            e.dept = dept;
            e.Emp_ID = id;
            e.salary = sal;
            eI[i] = e;
        }

        for (int i = 0 ; i< eI.length ; i++){
            if (eI[i].salary > 10000){
                try {
                    File f= new File("employee.txt");
                    PrintWriter pw = new PrintWriter(f);
                    pw.append(String.valueOf(eI[i].salary)).append(" here");
                    pw.flush();
                    pw.close();
                    System.out.println("success");
                }catch (Exception ex){
                    System.out.println(ex.getStackTrace());
                }
            }
        }
    }
}

public class Terminal {
    public class Main {

        public static void main(String[] args) {

            Employee_info e = new Employee_info();
            e.EMP_Data(e);


        }
    }
}