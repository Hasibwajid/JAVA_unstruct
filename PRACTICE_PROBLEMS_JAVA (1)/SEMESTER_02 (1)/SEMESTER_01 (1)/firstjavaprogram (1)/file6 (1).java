//package firstjavaprogram;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//
//public class file6 {
//    public static void main(String[] args) {
//        try {
//            File newFile=new File("D:\\ALL programing\\getting\\file6.txt");
//            if (newFile.createNewFile()){
//                System.out.println("File successfully created "+newFile.getName());
//                PrintWriter print =new PrintWriter(newFile);
//                print.print("hello i am file 6");
//                print.close();
//            }else {
//                System.out.println("File "+newFile.getName()+" id already exist ! please create with another name");
//            }
//
//        }
//        catch (Exception e){
//            System.out.println("An Error Occured");
//            e.printStackTrace();
//        }
//    }
//}
