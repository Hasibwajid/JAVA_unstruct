package OOP_Course.TASK;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("How many students you want to register?");
        int n=sc.nextInt();

        String student_id[]=new String[n];
        String student_names[]=new String[n];


        for (int i=0;i<student_id.length;i++)
        {
            System.out.println("Enter student "+(i+1)+" id :");
            String id=sc.next();
            System.out.println("Enter student "+(i+1)+" name :");
            String name=sc.next();
            student_id[i]=id;
            student_names[i]=name;
        }

        for (int i=0;i<student_id.length;i++)
        {
            System.out.println(i+") \nID :"+student_id[i]+" | NAME :"+student_names[i]);
        }
    }
}
