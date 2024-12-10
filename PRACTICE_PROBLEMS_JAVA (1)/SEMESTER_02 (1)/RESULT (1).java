import java.util.Scanner;

class Student{
    float midterm;
    float finalterm;
    float sessional;

    public void fun(float a,float b, float c) {
        midterm = a;
        finalterm = b;
        sessional = c;
    }
    public float total(){
        float total = 0;
        total = midterm+finalterm+sessional;
        return total;

    }
public class RESULT {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student std1 = new Student();
        Student std2 = new Student();
        for (int i=0;;i++){
        System.out.println("OPTION:\n 1.FIRST STUDENT \n 2. SECOND STUDENT \n 0.EXIT");
        int op=s.nextInt();
        if (op == 1) {
            System.out.println("ENTER MID TERM MARKS : ");
            std1.midterm=s.nextFloat();
            System.out.println("ENTER FINAL TERM MARKS : ");
            std1.finalterm=s.nextFloat();
            System.out.println("ENTER SESSIONAL TERM MARKS : ");
            std1.sessional=s.nextFloat();
            std1.fun(std1.midterm, std1.finalterm, std1.sessional);
            System.out.println("TOTAL NUMBER OF FIRST STUDENT : "+std1.total());
        }
        if (op == 2) {
            System.out.println("ENTER MID TERM MARKS : ");
            std2.midterm=s.nextFloat();
            System.out.println("ENTER FINAL TERM MARKS : ");
            std2.finalterm=s.nextFloat();
            System.out.println("ENTER SESSIONAL TERM MARKS : ");
            std2.sessional=s.nextFloat();
            std2.fun(std2.midterm, std2.finalterm, std2.sessional);
            System.out.println("TOTAL NUMBER OF SECOND STUDENT : "+std2.total());
        }
            if (op == 0) {
            break;
            }
        }}}}
