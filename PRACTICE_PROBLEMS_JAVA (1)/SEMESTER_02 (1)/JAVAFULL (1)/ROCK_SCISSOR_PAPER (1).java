//  ROCK SCISSOR PAPER GAME


//package JAVAFULL;
//import java.util.Random;
//import java.util.Scanner;
//
//public class DAY_2 {
//    public static void main(String[] args) {
//
//
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter 0 for scissor, 1 for rock, 2 for paper ");
//        int user=s.nextInt();
//            Random rand = new Random();
//            int randn = rand.nextInt(2);
//        if (user == 0) {
//            System.out.println("you chose : scissor.");
//        } else if (user == 1) {
//            System.out.println("you chose : rock.");
//        } else {
//            System.out.println("you chose : paper");
//        }
//        if (randn == 0) {
//            System.out.println("computer chose : scissor.");
//        } else if (randn == 1) {
//            System.out.println("computer chose : rock.");
//        } else {
//            System.out.println("computer chose : paper");
//        }
//            if (user==randn){
//                System.out.println("Match draw .");
//            }else if (user==0 && randn==1 || user==1 && randn==2 || user==2 && randn==0) {
//                System.out.println("You loss.");
//
//            }else {
//                System.out.println("Congratulations! You won.");
//            }
//        }
//    }
//
