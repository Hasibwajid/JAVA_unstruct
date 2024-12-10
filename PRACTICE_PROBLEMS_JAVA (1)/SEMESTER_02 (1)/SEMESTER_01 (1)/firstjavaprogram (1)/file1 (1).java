//package firstjavaprogram;
//import java.io.FileWriter;
//import java.io.File;
//import java.io.PrintWriter;
//import java.io.IOException;
//class file1 {
//    public static void main(String[] args) {
//        try{
//
//            //if we change path here of file then it will be change in all the code
//            File myFile=new File("D:\\ALL programing\\getting\\ file1.txt");//ADDRESS + NAME OF FILE
//            System.out.println("File Created");
//
//            FileWriter Write=new FileWriter((myFile));
//            PrintWriter printTxt=new PrintWriter(Write);
//            printTxt.print("MY FIRST FILE MESSAGE");
//
//            Write.close();
//        }catch (IOException e){
//            System.out.println("Error Occured");
//            e.printStackTrace();
//        } }
//}
