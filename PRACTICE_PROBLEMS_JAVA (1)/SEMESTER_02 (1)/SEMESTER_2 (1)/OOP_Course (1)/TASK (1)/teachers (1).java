package OOP_Course.TASK;

import java.util.Scanner;

public class teachers {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);

                System.out.println("How many teachers you want to register?");
                int n=sc.nextInt();

                String teacher_id[]=new String[n];
                String teacher_names[]=new String[n];


                for (int i=0;i<teacher_id.length;i++)
                {
                    System.out.println("Enter teacher "+(i+1)+" id :");
                    String id=sc.next();
                    System.out.println("Enter teacher "+(i+1)+" name :");
                    String name=sc.next();
                    teacher_id[i]=id;
                    teacher_names[i]=name;
                }

                for (int i=0;i<teacher_id.length;i++)
                {
                    System.out.println(i+") \nTeacher ID :"+teacher_id[i]+" | Teacher Name :"+teacher_names[i]);
                }
    }
}
