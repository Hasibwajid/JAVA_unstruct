package OOP_Course;

import java.util.Scanner;

class StudentsMS{
    Scanner sc=new Scanner(System.in);
    int t=1;
    int Students_id[]=new int[t];
    String StudentName[]=new String[t];
    boolean feeStatus[]=new boolean[t];
    int student_semester[]=new int[t];
    String student_subj[]=new String[t];
    int id=0;


    public void greeting() {
        System.out.println("Welcome to REVISION_PF.SMS");
        System.out.println("Select one option \n" +
                "1.Register new Student.\n" +
                "2.Search Student.\n" +
                "3.See All Registered Students Data.\n"+
                "4.Exit");

        int option=sc.nextInt();
        switch (option){
            case 1: RegisterNewUser();
            break;
            case 2:getDetailOFPerticularStudent();
            break;
            case 3: wantToSeeAllStudents();
            break;
            default: break;
        }

    }

    public void wantToSeeAllStudents() {

        for (int i=0;i<StudentName.length;i++)
        {
            System.out.println("SNO#"+i+1);
            System.out.println("Student Name : "+StudentName[i]+"\n" +
                    "Student id is : "+Students_id[i]+"\n" +
                    "Is Student fee Submited :"+feeStatus[i]+"\n" +
                    "Student subject :"+student_subj[i]);
        }
        System.out.println("\n\n");
        greeting();
    }

    public void getDetailOFPerticularStudent() {
        System.out.println("Enter Student ID To Get Detail : ");
        int id=sc.nextInt();

                System.out.println("Student Name : "+StudentName[id]+"\n" +
                        "Student id is : "+Students_id[id]+"\n" +
                        "Is Student fee Submited :"+feeStatus[id]+"\n" +
                        "Student subject :"+student_subj[id]+"\n");
//            }else {
//                System.out.println("Sorry there is no registed Student with this id.Please input valid id.");
//                getDetailOFPerticularStudent();
//            }
            greeting();
//        }

    }

    public  void RegisterNewUser() {
        System.out.println("How many students do you want to register");
        int cout=sc.nextInt();

        for (int i=id; i<cout;i++){
            System.out.println("Please enter your name: ");
            String name=sc.next();

            System.out.println("Enter your current semester no :");
            int semester_No=sc.nextInt();

            System.out.println("Is your fee is submited\n1.Yes\n2.No");
            int isSubmit=sc.nextInt();
            if (isSubmit==1){
                feeStatus[i]=true;
            }else {
                feeStatus[i]=false;
            }

            System.out.println("Enter you subject: ");
            String sub=sc.next();


            StudentName[i]=name;
            Students_id[i]=i;
            student_semester[i]=semester_No;
            student_subj[i]=sub;

            System.out.println("successfully registered ! \nYOUR ID IS :"+i+"\n");
            id++;
        }
        greeting();

    }
}

public class SMS {
    public static void main(String[] args) {
       StudentsMS s=new StudentsMS();
       s.greeting();

    }}


