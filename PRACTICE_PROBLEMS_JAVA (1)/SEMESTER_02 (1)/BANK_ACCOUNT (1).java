import java.util.Scanner;

class BANK{
    String NAME;
    int Account_no;
    int Total_balance;
    String Account_type;
    int Remaning_amount=0;
    Scanner s=new Scanner(System.in);
    public BANK (){
        System.out.print("Enter your name : ");
        NAME=s.nextLine();
        System.out.print("Enter Account type : ");
        Account_type=s.nextLine();
        System.out.print("Enter Account_no : ");
        Account_no=s.nextInt();
        System.out.print("Enter Total_balance : ");
        Total_balance=s.nextInt();
    }
    public void deposit(int d){
        Total_balance+=d;
    }
    public void withdraw(int w_d){
        if( w_d < Total_balance )
        Remaning_amount =Total_balance - w_d;
        System.out.println("REMAINING AMOUNT: "+Remaning_amount);
        System.out.println("WITHDRAW SUCCESSFULLY.");
    }
    public void display(){
        System.out.println("NAME OF DEPOSITOR : "+NAME);
        System.out.println("Remaining Balance : "+Remaning_amount);
    }}
public class BANK_ACCOUNT {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        BANK holder1=new BANK();
        for (int i=0;;i++){
        System.out.println("SELECT OPTION: \n 1. DEPOSIT \n 2. Withdraw \n 3. CHECK REMAINING BALANCE DETAIL \n 0.EXIT.");
        int op=in.nextInt();
        if (op==1){
            System.out.println("ENTER AMOUNT YOU WANT TO DEPOSIT : ");
            int d=in.nextInt();
            holder1.deposit(d);
            System.out.println("DEPOSIT SUCCESSFULLY.");
        }
        if (op==2){
            System.out.println("ENTER AMOUNT YOU WANT TO WITHDRAW : ");
            int w_d=in.nextInt();
            holder1.withdraw(w_d);
        }
        if (op==3){

            holder1.display();
        }
        if (op==0){
            System.out.println("THANKYOU ! " );
            break;
        }}}}
