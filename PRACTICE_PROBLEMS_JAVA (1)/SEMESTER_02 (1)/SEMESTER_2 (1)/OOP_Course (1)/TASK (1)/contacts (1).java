package OOP_Course.TASK;

import java.util.Scanner;

public class contacts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many contact you want to store?");
        int n=sc.nextInt();

        String contacts[]=new String[n];
        String names[]=new String[n];


        for (int i=0;i<contacts.length;i++)
        {
            System.out.println("Enter contact "+(i+1)+"'s name :");
            String name=sc.next();
            System.out.println("Enter your contact "+(i+1)+"'s no :");
            String cont=sc.next();
            names[i]=name;
            contacts[i]=cont;
        }

        for (int i=0;i<contacts.length;i++)
        {
            System.out.println(i+") \nname :"+names[i]+" | contact :"+contacts[i]);
        }

    }
}
