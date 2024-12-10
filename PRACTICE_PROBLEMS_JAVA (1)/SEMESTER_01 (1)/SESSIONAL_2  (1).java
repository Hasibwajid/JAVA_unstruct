//package CodewithHarry;
//import java.util.Scanner;
//class Vehicle_ {
//    int Vehicle_ID;
//    String Owner_Name;
//    String VEHICLE_Name;
//    int V_RegNo;
//    int Engine_No;
//
//    public void V_input() {
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("ENTER THE VEHICLE_ID        :: ");
//        Vehicle_ID = in.nextInt();
//        System.out.print("ENTER THE VEHICLE NAME      :: ");
//        VEHICLE_Name = in.next();
//        System.out.print("ENTER THE VEHICLE REG NO    :: ");
//        V_RegNo = in.nextInt();
//        System.out.print("Enter the VEHICLE ENGINE NO :: ");
//        Engine_No = in.nextInt();
//        System.out.print("ENTER THE VEHICLE OWNER NAME      :: ");
//        Owner_Name = in.next();
//    }
//
//    public void display() {
//
//        System.out.print("\t    \t| VEHICLE ID IS           = " + Vehicle_ID);
//        System.out.println("\t  \t| VEHICLE NAME IS         = " + Owner_Name);
//        System.out.print("\t    \t| ENGINE NO OF VEHICLE IS = " + VEHICLE_Name);
//        System.out.print("\t    \t| ENGINE NO OF VEHICLE IS = " + Engine_No);
//        System.out.println("\t  \t| REG_NO OF VEHICLE IS    = " + V_RegNo);
//    }
//
//    public static class LAB_SESSIONAL2 {
//
//        public static void main(String[] args) {
//
//            Vehicle_ V[] = new Vehicle_[11];
//
//            for (int i = 1; i < 11; i++) {
//                System.out.println(" \t \t \t \t \t  **** DATA ENTRY FOR VEHICLES**** " + i + "\n");
//                V[i] = new Vehicle_();
//                V[i].V_input();
//                System.out.println("\n");
//            }
//
//            System.out.println(" INFORMATION OF 10 VEHICLES IS AS FOLLOW ");
//
//            for (int i = 1; i < 11; i++) {
//                System.out.println("       ********INFO OF VEHICLE" + i + "\n");
//                V[i].display();
//                System.out.println("\n");
//                System.out.println("________________________________________________________##\n");
//            }
//
//            System.out.println("                                           THANK YOU!");
//
//        }
//    }
//}