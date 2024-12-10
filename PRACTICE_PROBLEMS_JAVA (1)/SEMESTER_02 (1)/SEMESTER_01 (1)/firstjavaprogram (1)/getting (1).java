//package firstjavaprogram;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//
//public class getting {
//    public static void main(String[] args) {
//        File myObj = new File("D:\\ALL programing\\getting");
//           File[] f=myObj.listFiles();
//            for(File file:f){
//                if(file.isFile()){
//                    BufferedReader inputStream=null;
//                    String line;
//
//                try{
//                inputStream=new BufferedReader(new FileReader(file));
//                  while ((line=inputStream.readLine()) !=null) {
//                      System.out.println(line);
//                  }
//        } catch (Exception e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }}}}}
