////File_assignment
//package firstjavaprogram;
//import java.io.*;
//class File2 {
//    public static void main(String[] args) {
//
//        try{
//            File myobj=new File("D:\\ALL programing\\getting\\file2.txt");
//            FileWriter myFile=new FileWriter(myobj);
//            myFile.write("Account"+"\t"+"First Name"+"\t"+"Last Name"+"\t"+"Balance"+"\n");
//            myFile.write("100"+"\t"+"\tBob"+"  \t \t"+"Jones"+"\t \t"+"  24.98"+"\n");
//            myFile.write("200"+"\t"+"\tSteve"+"\t\t"+"Doe"+"\t \t"+"     -345.67"+"\n");
//            myFile.write("300"+"\t"+"\tPam"+"  \t \t"+"White"+"\t \t"+"  0.00"+"\n");
//            myFile.write("400"+"\t"+"\tSam"+"  \t \t"+"Stone"+"\t \t"+"  -42.16"+"\n");
//            myFile.write("500"+"\t"+"\tSue"+"   \t \t"+"Rich"+"\t \t"+"  224.62");
//            myFile.close();
//            System.out.println("Successfully write to the file");
//        }
//        catch (IOException e) {
//            System.out.println("An error occured");
//            e.printStackTrace();
//        }
//    }
//}
