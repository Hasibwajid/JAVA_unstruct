//package TASKS;
//import java.util.Scanner;
//public class PS {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter an string");
//        String str = s.nextLine();
//        int a = str.length();
//        char arr[] = new char[a];
//        for (int i = 0; i < a; i++) {
//            str.getChars(i, a, arr, i);
//            System.out.println("Your entered String is:");
//            System.out.println( arr);
//            System.out.println("Search a character from array if exixt then you receive msg Yes : ");
//            for (int b = 0; b <= a; ) {
//                char j = s.next().charAt(b);
//                for (char r : arr) {
//                    if (r == j) {
//                        System.out.println("YES " + j + " is in array.");
//                        break;
//                    } else {
//                        b++;
//                    }
//                }
//                System.out.println("................................");
//                break;
//            }
//        }
//    }
//}
