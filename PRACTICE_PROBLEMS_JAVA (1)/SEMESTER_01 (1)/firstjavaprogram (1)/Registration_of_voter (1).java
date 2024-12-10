//package firstjavaprogram;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.time.format.DateTimeFormatter;
//import java.time.LocalDateTime;
//import java.util.Scanner;
//import java.io.IOException;
//
////class
//class Registration_of_voter {
//    //initiallizing a variables in class
//    static String name;
//    static String CNIC_No;
//    static String F_name;
//    static int  age;
//    static String Address;
//    static String province;
//
//    public static void main(String[] args) {
//        //File created with name "VoterRegistry" in csv file
//        File myobj = new File("VoterRegistry.csv");
//        try {
//            //Scanner define
//            Scanner s = new Scanner(System.in);
//            FileWriter Write = new FileWriter(myobj);
//            PrintWriter p=new PrintWriter(Write);
//
//
//            //for loop use for iteration on entries
//        for(int i=1;i!=0;i++){
//            //Set format of date and time
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" yyyy/MM/dd   HH:mm:ss");
//            LocalDateTime now = LocalDateTime.now();
//            p.println("\t\t\t\t\t>>>>>>>> VOTER REGISTRATION <<<<<<<< \n");
//
//            //print date and time in file
//            p.println("\nEntry no >> "+i+ " \t\t\t\t\t\t\t\t\t\tDATE_TIME "+dtf.format(now)+"\n");
//
//            //print date and time on console for applicant
//            System.out.println("\nEntry no >> "+i+ " \t\t\t\t\t\t\t\t\t\tDATE_TIME "+dtf.format(now));
//
//            //start entry
//            System.out.print("ENTER YOU NAME\t\t\t: " );
//            name = s.nextLine();
//            System.out.print("Enter your Father name  : "  );
//            F_name = s.nextLine();
//
//            System.out.print("Enter your CNIC\t\t\t: "  );
//            CNIC_No = s.nextLine();
//            System.out.print("Enter your Province\t\t: " );
//            province = s.nextLine();
//            System.out.print("Enter your Address\t\t: " );
//            Address = s.nextLine();
//            System.out.print("Enter your age\t\t\t: ");
//            age = s.nextInt();
//            //add data to the file
//
//            Write.append("\nNAME      : "+name);
//            Write.append("\nFATER NAME: "+F_name);
//            Write.append("\nCNIC NO   : "+CNIC_No);
//            Write.append("\nAGE       : "+age);
//            Write.append("\nADDRESS   : "+Address);
//            Write.append("\nPROVINCE  : "+province+"\n\n## ENTRY "+i+" COMPLETED ##\n\n");
//            Write.append("----------------------------------------------------------------------------------------");
//
//            System.out.println(" \n #######///   SUCCESSFULLY REGISTERED!  ///######## ");
//
//            //for end the iteration enter 0
//            System.out.println("\nDEAR ! ENTER ANY NUM ACCEPT 0 IF YOU WANT TO REGISTER >> ");
//             int c=s.nextInt();
//             if (c==0){
//                 System.out.println("THANKYOU! ALL REGISTRIES COMPLETTED");
//                 break;
//             }
//        }Write.close();} catch (IOException ioException) {
//            ioException.printStackTrace();
//
//    } }}