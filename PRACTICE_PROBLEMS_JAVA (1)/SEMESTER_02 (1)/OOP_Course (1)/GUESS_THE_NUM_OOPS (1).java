package OOPS;

import java.util.Random;
import java.util.Scanner;


class GAME{

    Random random=new Random();
    Scanner s=new Scanner(System.in);

    int comp_Choice;
    int user_input;
    int num_of_tries_left=10;
    int Total_num_oF_tries=10;


public GAME(){

   comp_Choice = random.nextInt(100);

}


public  void takesUserInput(){

    System.out.println("ENTER A NUM: ");
    user_input = s.nextInt();
}


public  void isCorrect() {

    if (user_input == comp_Choice) {
        System.out.println("Congratulations! You WON"+" On your "+(Total_num_oF_tries-num_of_tries_left)+" Try.");
    } else if (user_input > comp_Choice) {
        System.out.println("Your num is greater than the origional num.");
    } else{
        System.out.println("Your num is smaller than the origional num.");
    }
    num_of_tries_left--;
}

}



public class GUESS_THE_NUM_OOPS {

    public static void main(String[] args) {

        GAME start=new GAME();
        System.out.println("You have Total "+start.Total_num_oF_tries+" num of tries.\n BEST OF LUCK! ");


        for(int i=0;i<start.Total_num_oF_tries;i++) {
            System.out.println("You have "+(start.num_of_tries_left)+" num of tries left.");
            start.takesUserInput();
            start.isCorrect();
            if (start.user_input== start.comp_Choice){
                break;
            }
        }


    }
}
