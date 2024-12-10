package ADVANCE_JAVA;

import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.Scanner;


class BOOKS{
    String book_name;
    String Auther;
    String Issue_to;

    public BOOKS(String book_name, String auther) {
        this.book_name = book_name;
        Auther = auther;
    }


}
/**
 * This Is Library Management System Developed By Haseeb Wajid From Pakistan
 * @author HAseeb (haseeb wajid)
 * @version 0.1
 * @since 2020
 * @see <a href="https://docs.oracle.com/en/java/javase/16/docs/api/index.html" target="_blank">Java Docs</a>
 */
public class PS_LMS_CWH {
    static ArrayList<BOOKS> books=new ArrayList<>();
    static ArrayList<BOOKS> issuedBooks=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("WELCOME TO LMS");
        inoption();

    }

    public static void inoption(){
        System.out.println("PLEASE SELECT ONE:\n"+
                "1.Add Book\n" +
                "2.See All Books\n"+
                "3.Remove Book\n"+
                "4.Issue Book\n"+
                "5.Issued Books\n"+
                "6.Quit");

        int option=sc.nextInt();
        switch (option){
            case 1: addBook();
                break;
            case 2: seeAllBooks();
                break;
            case 3: removeBook();
                break;
            case 4: issueBook();
                break;
            case 5: issuedBook();
                break;
            default: break;
        }
    }

    private static void issuedBook() {
        if (issuedBooks.isEmpty()){
            System.out.println("No Book Issued.");
        }else {
            for (BOOKS b : issuedBooks) {
                System.out.println("NAME: " + b.book_name);
                System.out.println("AUTHER: " + b.Auther+"\n");
            }
        }
        inoption();
    }

    private static void issueBook() {
        System.out.println("Enter BOOK Name Which You Want To Issue ? ");
        String name=sc.next();
        for (BOOKS b:books){
            if (b.book_name.equals(name)){
                System.out.println("1.Want to see "+b.book_name+"'s info\n"+
                        "2.Want to issue "+b.book_name
                       );
                int op=sc.nextInt();
                switch (op){
                    case 1:
                        System.out.println("NAME : "+b.book_name);
                        System.out.println("AUTHER NAME:"+b.Auther);
                        issueBook();
                        break;
                    case 2:
                        issuedBooks.add(b);
                        System.out.println("Success");
                        break;
                }
            }else {
                System.out.println("THERE IS NO BOOK WITH NAME "+name);
            }
           inoption();
        }

    }

    private static void removeBook() {
        System.out.println("Enter book name: ");
        String name=sc.next();
        boolean isExist=false;
        for (BOOKS p: books){
            if (p.book_name.equals(name)){
                isExist=true;
                System.out.println("Are you sure you want to remove "+p.book_name+"?\n"+
                        "1.Yes\n"+
                        "2.No");
                int op=sc.nextInt();
                if (op==1){
                    books.remove(p);
                    System.out.println("removed success\n");
                    inoption();
                }else {
                    inoption();
                }
            }

        }
        if (isExist==false){
            System.out.println("SORRY THERE IS NO BOOK WITH NAME "+name);
        }

        inoption();
    }

    private static void seeAllBooks() {
        if (books.isEmpty()){
            System.out.println("SORRY! THERE IS NO BOOK IN LMS YET.");
        }
        else{
            for (BOOKS b: books){
                System.out.println("name:"+b.book_name);
                System.out.println("auther:"+b.Auther+"\n");
            }
        }
        inoption();
    }

    private static void addBook() {
        System.out.println("Please Enter the name of book: ");
        String b_name=sc.next();
        System.out.println("Auther Name: ");
        String a_name=sc.next();
        books.add(new BOOKS(b_name,a_name));
        System.out.println("Book Added!");
        inoption();

    }


}
