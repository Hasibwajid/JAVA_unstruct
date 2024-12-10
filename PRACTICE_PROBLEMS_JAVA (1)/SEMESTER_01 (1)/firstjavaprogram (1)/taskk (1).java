//package firstjavaprogram;
//import java.io.PrintWriter;
//import java.io.File;
//import java.util.Scanner;
//import java.io.IOException;
// public class taskk{
//     public static void main(String[] args)throws IOException {
//        String name;
//        String CNIC_No;
//        String F_name;
//        int  age;
//        String Address;
//        String province;
//        File task=new File("vote.txt");
//        try{
//            Scanner s=new Scanner(System.in);
//            PrintWriter p=new PrintWriter(task);
//            for (int i=1;i<=3;i++) {
//                p.println("Registration No " + i);
//                System.out.print("Enter your name    : ");
//                name = s.nextLine();
//                System.out.print("Enter your F_name  : ");
//                F_name = s.nextLine();
//                System.out.print("Enter your CNIC_No : ");
//                CNIC_No = s.nextLine();
//                System.out.print("Enter your Address : ");
//                Address = s.nextLine();
//                System.out.print("Enter your province: ");
//                System.out.print("Enter your age     : ");
//                age = s.nextInt();
//                province = s.nextLine();
//                p.append("\n" + name);
//                p.append("\n" + F_name);
//                p.append("\n" + CNIC_No);
//                p.append("\n" + age);
//                p.append("\n" + Address);
//                p.append("\n" + province);
//                p.println("\n");
//                System.out.println("Entry" +i +" is completed");
//            }
//                p.close();
//        }
//        catch (IOException e){
//            System.out.println("An error");
//            e.printStackTrace();
//        }
//    }
//}