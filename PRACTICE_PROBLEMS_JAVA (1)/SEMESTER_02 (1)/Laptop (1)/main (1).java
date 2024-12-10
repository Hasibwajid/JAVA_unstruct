package Laptop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String exit;
        System.out.println("1.Hp laptop\n" +
                "2.Dell laptop\n" +
                "3.Mac book");
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        switch (i){
            case 1 -> {
                hpLaptops h =new hpLaptops();
                do{
                System.out.println("1.Show detail\n" +
                        "2.Buy\n");
                int ch=s.nextInt();
                if (ch==1){
                    h.details();

                }else if(ch==2){
                    System.out.println("Total price after discount is: "+h.discount(h.getPrice()));
                    System.out.println("1.Done.\n" +
                            "2.Exit");
                    int in=s.nextInt();
                    if(in==1){
                        System.out.println("Successsfully alloted.");
                    }else if(in==2){
                        System.out.println("Thanks for coming");
                        break;
                    }
                }
                    System.out.println("Do you want to exit (y/n)?");
                    exit=s.next().toUpperCase();
            }while (exit.equals("N"));

        }}
    }
}
