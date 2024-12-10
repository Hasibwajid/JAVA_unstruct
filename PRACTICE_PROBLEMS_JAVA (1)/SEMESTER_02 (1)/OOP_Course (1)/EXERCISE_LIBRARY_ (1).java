package OOPS;

import java.util.Scanner;

class Library{
    Scanner sc=new Scanner(System.in);
     String [] Books_available=new String[100];
     String [] issue_books;
     int no_of_books=0;
     int book_no;
     int add;


    public void add_books(){
        System.out.println("Enter how many books you want to add !");
        add=sc.nextInt();
        for (int i=0;i<add;i++)
        {
            System.out.println("No : "+(i+1));
            Books_available[i]=sc.next();
            no_of_books++;
        }
    }
    public void issue_books(){
        System.out.println("Available books are : ");
        for (int i=0;i<no_of_books;i++)
        {
            System.out.println(i+1+" ."+Books_available[i]);
        }
        System.out.println("Enter the no of that book which you want to issue.");
        book_no=sc.nextInt();
        Books_available[book_no-1]=null;
        System.out.println("Successfully issued..");

    }

     public void show_available_books() {
         System.out.println("AVAILABLE BOOKS : ");
        for (int i=0;i<no_of_books;i++){
            if(Books_available[i]==null){
                System.out.println(i+1+" issued...");
                continue;
            }
            System.out.println(i+1+" ."+Books_available[i]);
        }

     }
    public void return_books(){
        System.out.println("Enter Book name to return");
        String name=sc.next();
        Books_available[book_no-1]=name;
    }
}
public class EXERCISE_LIBRARY_ {
    public static void main(String[] args) {
        Library l1=new Library();
        l1.add_books();
        l1.issue_books();
        l1.show_available_books();
        l1.return_books();
        l1.show_available_books();
    }
}
