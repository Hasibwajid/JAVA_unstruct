//package CodewithHarry;
//////
//public class STUDREC {
////    public static class Laptop {
////
////        //
//////        public static int  findIndex (int[] my_array, int t) {
//////            if (my_array == null) return -1;
//////            int len = my_array.length;
//////            int i = 0;
//////            while (i < len) {
//////                if (my_array[i] == t) return i;
//////                else i=i+1;
//////            }
//////            return -1;
//////        }
//        public static void main(String[] args) {
//            int[][] arr = {{3, 2, 1}, {1, 2, 3}};
//            int value = 0;
//            for (int row = 1; row < arr.length; row++) {
//                for (int col = 1; col < arr[0].length; col++) {
//                    if (arr[row][col] % 2 == 1) {
//                        arr[row][col] = arr[row][col] + 1;
//                    }
//                    if (arr[row][col] % 2 == 0) {
//                        arr[row][col] = arr[row][col] * 2;
//                    }
//                }
//            }
//        }}
//////            int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//////            System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
//////            System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
//////        }
//////    }
////        public void start() {
////            try {
////                System.out.print("Starting up ");
////                throw new Exception();
////            } catch (Exception e) {
////                System.out.print("Problem ");
////                System.exit(0);
////            } finally {
////                System.out.print("Shutting down ");
////            }
////        }
////
////        public static void main(String[] args) {
////            new Laptop().start();
////        }
////
////    }}
////
////
//////    static String name ;
//////    static String address;
//////    static int s1, s2, s3;
//////    static String grade;
//////
//////    static int tm=300;
//////    static int om=0;
//////    static float perscentage;
//////
//////
//////    public static void main(String[] args) throws IOException {
////////        Write a java code to get input
////////        records of 10 students and write these records into a "csv" file.
////////                The record of a student contains the following fields, Name, address,
////////                marks in three subjects (s1, s2, s3), calculate the total marks
////////                (s1+s2+s3) and also find out the grade (>90% is "A" grade, >80% is
////////                "B" grade, >70% is "C" grade, >60% is "D" grade, and <60% is "F" grade,) of each student.
//////        Scanner s=new Scanner(System.in);
//////        File myf=new File("std.csv");
//////        FileWriter wr=new FileWriter(myf);
//////        PrintWriter pw=new PrintWriter(myf);
//////
//////
//////
//////
//////        int[] arr=new int[10];
//////        for (int i=0; i<arr.length;i++){
//////            System.out.println("Enter name of stud "+ i+" :" );
//////            name=s.nextLine();
//////            System.out.println("Adress of stud: " + i +" :" );
//////            address=s.nextLine();
//////            System.out.println("marks of s1 of stud: " +i+" :"  );
//////            s1=s.nextInt();
//////            System.out.println("marks of s2 of stud:" +i+ " :" );
//////            s2=s.nextInt();
//////            System.out.println("marks of s3 of stud: "+i +" :" );
//////            s3=s.nextInt();
//////            om =s1+s2+s3;
//////            perscentage=om/300;
//////            if(perscentage >90){
//////                System.out.println(grade + " A");
//////                grade="A";
//////            }
//////            else if(perscentage >80){
//////                System.out.println(grade + "B");
//////                grade="B";
//////            }
//////            else if(perscentage >70){
//////                System.out.println(grade + "c");
//////                grade="C";
//////            }
//////            else if(perscentage >60){
//////                System.out.println(grade + "d");
//////                grade="D";
//////            }
//////            else {
//////                System.out.println(grade + " F");
//////                grade="F";
//////            }
//////
//////            pw.append("Enter name of stud: "+ name);
//////            pw.append("Adress of stud: " + address);
//////            pw.println("marks of s1 of stud: " +i+"  "+s1);
//////            pw.println("marks of s2 of stud:"+i +"  "+s2);
//////            pw.println("marks of s3 of stud:"+ i+ "  "+s3);
//////            pw.append(grade);
//////        }
//////
//////
//////
//////
//////
//////
//////    }
//////}
