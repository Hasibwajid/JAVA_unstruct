package firstjavaprogram;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//        Create a class of “Employee_info” with following parameters (Emp_ID,
//        Emp_name, Dept, Salary). [10 Marks]
//        Write a user defined function EMP_Data (for data input of 10 Employees) with
//        object of “Employee_info” as parameter. [10 Marks]
//        Store this information in array of “Employee_info” type. [10 Marks]
//        Write a user defined function to write the list of employees having salary
//        greater than Rs10,000/- in file named “employee.txt”


class Employee_info {
    static ArrayList<Employee_info> Employees = new ArrayList<Employee_info>();
    static ArrayList<Employee_info> vEmployees = new ArrayList<Employee_info>();
    int EmpID;
    String EmpName;
    String Dept;
    int Salary;


    public Employee_info(int empID, String empName, String dept, int salary) {
        EmpID = empID;
        EmpName = empName;
        Dept = dept;
        Salary = salary;
    }

    static void add(Employee_info Employee_info) {
        Employee_info.add(Employee_info);

    }

    public static void saveEmployee_infoData(List<Employee_info> Employees) {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {


//            String string = "";


            fileWriter  = new FileWriter("Employee_info.txt");

            printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < Employees.size(); i++) {

                fileWriter.append( "Employee_info" + i + " : " + "," + Employees.get(i).EmpName + "," + Employees.get(i).EmpID + "," + Employees.get(i).Dept + "," + Employees.get(i).Salary + ",");

//                printWriter.println(string);

            }

            printWriter.flush();
            printWriter.close();
            fileWriter.close();

        } catch (Exception exception) {

            System.out.println(exception);

        }

    }

    public static void E_output(List<Employee_info> Employees) {

        for (int i = 0; i < Employee_info.Employees.size(); i++) {

            int salary;


            salary = Employee_info.Employees.get(0).Salary;


            if (salary > 10000) {

                System.out.println("Employee Name : " + Employee_info.Employees.get(i).EmpName);
                System.out.println("Employee ID : " + Employee_info.Employees.get(i).EmpID);
                System.out.println("Employee Dept : " + Employee_info.Employees.get(i).Dept);
                System.out.println("Employee Salary : " + Employee_info.Employees.get(i).Salary);

                vEmployees.add(Employee_info.Employees.get(i));

            }


        }

    }

    public static void EMP_Data(int totalEmployee_infos) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < totalEmployee_infos; i++) {

            int empID;
            String empName;
            String dept;
            int salary;

            System.out.println("Enter Employee Name = ");

            empName = scanner.nextLine();

            System.out.println("Enter Dept          = ");

            dept = scanner.nextLine();

            System.out.println("Enter Employee ID = ");

            empID = scanner.nextInt();

            System.out.println("Enter Employee Salary = ");

            salary = scanner.nextInt();

            Employee_info Employee_info = new Employee_info(empID, empName, dept, salary);

            add(Employee_info);


        }

    }


}
 public class TERMINAL_EXAM {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the total num of Employee_infos for getting their input");

            int totalNumOfEmployee_infos = scanner.nextInt();

            Employee_info.EMP_Data(totalNumOfEmployee_infos);


            Employee_info.saveEmployee_infoData(Employee_info.vEmployees);

            Employee_info.E_output(Employee_info.Employees);


        }
    }
