package OOPS_FreeCodeCamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        patient patient=new patient("bran",20,new Eye("left Eye","short sighted",
                "blue",true),new Eye("Right Eye","Normal","black",true),
                new Heart("Heart","Normal",22),new stomach("stomach",
                "Normal",true),new skin("Skin", "Burned","white",33));


        System.out.println("Name : "+patient.getName());
        System.out.println("Age : "+patient.getAge());



        Scanner scanner=new Scanner(System.in);



        boolean shouldFinish=false;



        while (!shouldFinish){
            System.out.println("Choose an oegan :" +
                    "\n\t1.Left Eye"+
                    "\n\t2.Right Eye"+
                    "\n\t3.Heart "+
                    "\n\t4.Stomach "+
                    "\n\t5.Skin "+
                    "\n\t6.Quit ");



            int choice=scanner.nextInt();
            switch (choice){
                case 1 : patient.getLeftEye().getDetail();
                if (patient.getLeftEye().isOpen()){
                    System.out.println("\t\t 1. Close the Eye");
                    if (scanner.nextInt()==1){
                        patient.getLeftEye().close();
                    }else {
                        continue;
                    }
                }else {
                    System.out.println("\t\t 1. Open the Eye");
                    if (scanner.nextInt()==1){
                        patient.getLeftEye().open();
                    }else {
                        continue;
                    }
                }
                break;


                case 2 : patient.getRightEye().getDetail();
                if (patient.getRightEye().isOpen()){
                    System.out.println("\t\t 1. Close the Eye");
                    if (scanner.nextInt()==1){
                        patient.getRightEye().close();
                    }else {
                        continue;
                    }
                }else {
                    System.out.println("\t\t 1. Open the Eye");
                    if (scanner.nextInt()==1){
                        patient.getRightEye().open();
                    }else {
                        continue;
                    }
                }
                break;


                case 3 :
                    patient.getHeart().getDetail();
                    System.out.println("\t\t1.change heart rate");
                    if (scanner.nextInt()==1){
                        System.out.println("Enter the new Heart rate");
                        int newHeartRate=scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to "+patient.getHeart().getRate());
                    }else {
                        continue;
                    }
                    break;

                case 4 :
                    patient.getStomach().getDetail();
                        System.out.println("\t\t1.Digest");
                    if (scanner.nextInt()==1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;

                case 5 :
                    patient.getSkin().getDetail();
                    break;

                default:
                    shouldFinish=true;
                    break;

            }
        }
    }
}
