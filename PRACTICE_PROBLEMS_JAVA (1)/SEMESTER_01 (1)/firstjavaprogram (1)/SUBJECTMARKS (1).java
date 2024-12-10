//package firstjavaprogram;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.util.Scanner;
//import java.io.IOException;
//public class SUBJECTMARKS {
//
//    public static void main(String[] args) throws IOException {
//        float a = 0;
//
//        File yes = new File("Desktop.txt");
//        FileWriter yes1 = new FileWriter(yes);
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter your name:");
//        String name = s.nextLine();
//        System.out.print("Enter your Roll No.:");
//        int roll = s.nextInt();
//
//        String[] subs = {"PF", "ICT", "ISL", "CALCULUS", "ENGLISH"};
//        float[] marks = new float[subs.length];
//
//        for (int i = 0; i < subs.length; i++) {
//            System.out.print("Enter Marks in " + subs[i] + ": ");
//            marks[i] = s.nextFloat();
//            a += marks[i];
//        }
//
//        yes1.append("Name:," + name + "\n");
//        yes1.append("Roll No.:," + roll + "\n");
//        yes1.append("Total," + a + "\n");
//        yes1.append("S#,Subject,Marks,\n");
//
//        for (int i = 0; i < subs.length; i++) {
//            yes1.append((i + 1) + ". " + subs[i] + "," + marks[i] + "\n");
//        }
//
//
//        yes1.close();
//    }
//
//}
//
//
//
//
//
//
