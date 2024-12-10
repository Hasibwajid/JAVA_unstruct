//package OOP_Course.RMS;
//import java.util.ArrayList;
//import java.util.Scanner;
//public class DemoRMS {
//    static String init="\nSelect one:\n" +
//            "1.Add .\n" +
//            "2.Show .\n" +
//            "3.Back to main menu.";
//
//    static ArrayList<Customer> custommerArrayList = new ArrayList<>();
//    static ArrayList<Employee> employeeArrayListAL = new ArrayList<>();
//    static ArrayList<Food> foodArrayList = new ArrayList<>();
//    static ArrayList<Train> trainArrayList = new ArrayList<>();
//    static ArrayList<Station> stationArrayList = new ArrayList<>();
//
//    static Scanner s = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        initialOp();
//        }
//
//        private static void initialOp () {
//            System.out.print("\n1.Train.\t\t\t2.Station.\t\t\t3.Employee.\n4.Food.\t\t\t\t5.Customer.\t\t\t0.Exit.\nSelect One:\n");
//            int input = s.nextInt();
//
//            switch (input) {
//                case 1:
//                    train();
//                    break;
//                case 2:
//                    station();
//                    break;
//                case 3:
//                    empoyees();
//                    break;
//                case 4:
//                    food();
//                    break;
//                case 5:
//                    custommer();
//                    break;
//                case 0:
//                    break;
//            }
//        }
//
//        private static void custommer () {
//         Customer c=new Customer();
//         System.out.println(init);
//         int choose = s.nextInt();
//         switch (choose) {
//             case 1:
//                    System.out.print("Enter Customer ID: ");
//                    int id = s.nextInt();
//                    System.out.print("Enter Name: ");
//                    String name = s.next();
//                    System.out.print("Enter Phone Number: ");
//                    Long phoneNum = s.nextLong();
//                    System.out.print("Enter E-mail: ");
//                    String email = s.next();
//                    System.out.print("Enter Address: ");
//                    String address = s.next();
//                    c=new Customer(id,name,email,address,phoneNum);
////                    custommerArrayList.add(new Customer(id,name,email,address,phoneNum));
//
//                    System.out.println("Added success.");
//                    System.out.println("BACK TO MAIN MENU? : y/n");
//                    char i=s.next().charAt(0);
//                    if(i=='y' || i=='y'){
//                        initialOp();
//                    }else {
//                        System.out.println(init+"\n");
//                        choose=s.nextInt();
//                    }
//                case 2:
//                    c.showDetail();
//                    initialOp();
//                case 3:
//                    initialOp();
//            }
//        }
//
//        private static void food () {
//            Food f = new Food();
//            System.out.println(init);
//            int choose = s.nextInt();
//            switch (choose) {
//                case 1:
//                    System.out.print("Enter Food ID:");
//                    int foodID = s.nextInt();
//                    System.out.print("Enter Food Name:");
//                    String foodName = s.next();
//                    System.out.print("Enter Food Type:");
//                    String foodType = s.next();
//                    System.out.print("Enter Food Price:");
//                    int foodPrice = s.nextInt();
//                    System.out.print("Enter Food Description:");
//                    String foodDescription = s.next();
//                    f=new Food(foodName,foodType,foodDescription,foodID,foodPrice);
//
////                    foodArrayList.add(new Food(foodName,foodType,foodDescription,foodID,foodPrice));
//
//                    System.out.println("Added success.");
//                    System.out.println("BACK TO MAIN MENU? : y/n");
//                    char i=s.next().charAt(0);
//                    if(i=='y' || i=='y'){
//                        initialOp();
//                    }else {
//                        System.out.println(init+"\n");
//                        choose=s.nextInt();
//                    }
//                case 2:
//                    f.showFood();
//                    initialOp();
//                case 3:
//                    initialOp();
//            }
//        }
//
//        private static void empoyees () {
//            Employee e = new Employee();
//            System.out.println(init);
//            int choose = s.nextInt();
//            switch (choose) {
//                case 1:
//                    System.out.print("Enter Id:");
//                    int id = s.nextInt();
//                    System.out.print("Enter Name:");
//                    String name = s.next();
//                    System.out.print("Enter Phone Number:");
//                    Long phoneNum = s.nextLong();
//                    System.out.print("EnterEmail:");
//                    String email = s.next();
//                    System.out.print("Enter Address:");
//                    String address = s.next();
//                    e=new Employee(id,name,email,address,phoneNum);
//
////                    employeeArrayListAL.add(new Employee(id,name,email,address,phoneNum));
//
//                    System.out.println("Added success.");
//                    System.out.println("BACK TO MAIN MENU? : y/n");
//                    char i=s.next().charAt(0);
//                    if(i=='y' || i=='y'){
//                        initialOp();
//                    }else {
//                        System.out.println(init+"\n");
//                        choose=s.nextInt();
//                    }
//                case 2:
//                    e.showDetail();
//                    initialOp();
//                case 3:
//                    initialOp();
//            }
//        }
//
//        private static void station () {
//            Station st = new Station();
//            System.out.println(init);
//            int choose = s.nextInt();
//            switch (choose) {
//                case 1:
//                    System.out.print("Enter Station Name:");
//                    String stationName = s.next();
//                    System.out.print("Enter Station Capacity:");
//                    int stationCapacity = s.nextInt();
//                    System.out.print("Enter Station Address:");
//                    String stationAddress = s.next();
//                    st=new Station(stationName,stationAddress,stationCapacity);
//
////                    stationArrayList.add(new Station(stationName,stationAddress,stationCapacity));
//
//                    System.out.println("Added success.");
//                    System.out.println("BACK TO MAIN MENU? : y/n");
//                    char i=s.next().charAt(0);
//                    if(i=='y' || i=='y'){
//                        initialOp();
//                    }else {
//                        System.out.println(init+"\n");
//                        choose=s.nextInt();
//                    }
//                case 2:
//                    st.showStation();
//                    initialOp();
//                case 3:
//                    initialOp();
//            }
//        }
//
//        private static void train () {
//            Train t = new Train();
//            System.out.println(init);
//            int choose = s.nextInt();
//            switch (choose) {
//                case 1:
//                    System.out.println("Enter Train id :");
//                    int id=s.nextInt();
//                    System.out.println("Enter Train name :");
//                    String name=s.next();
//                    System.out.println("Enter Train campartment :");
//                    int compartments=s.nextInt();
//                    System.out.println("Enter Train capacity :");
//                    int capacity=s.nextInt();
//                    System.out.println("Enter Train engine no :");
//                    int engineNo=s.nextInt();
//                    t=new Train(id,name,compartments,capacity,engineNo);
//
////                    trainArrayList.add(new Train(id,name,compartments,capacity,engineNo));
//
//                    System.out.println("Added success.");
//                    System.out.println("BACK TO MAIN MENU? : y/n");
//                    char i=s.next().charAt(0);
//                    if(i=='y' || i=='y'){
//                        initialOp();
//                    }else {
//                        System.out.println(init+"\n");
//                        choose=s.nextInt();
//                    }
//                case 2:
//                    t.showTrain();
//                    initialOp();
//                case 3:
//                    initialOp();
//            }
//        }
//}