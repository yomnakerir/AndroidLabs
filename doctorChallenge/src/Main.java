// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        patientInfo();

    }


    static void patientInfo(){

        int chosenNumber = 0;

        LeftEye myLeftEye = new LeftEye("Left Eye", "short sighted", "blue");
        RightEye myRightEye = new RightEye("Right Eye", "normal", "blue");
        Heart myHeart = new Heart("Heart", "normal", 75);
        Stomach myStomach = new Stomach("Stomach", "pud");
        Skin mySkin = new Skin("Skin", "Burned");

        do {
            System.out.println("\nName: Tom\nAge: 25\nChoose an organ: \n" +
                    "\t1.Left Eye\n\t2.Right Eye\n\t3.Heart\n\t4.Stomach\n\t5.Skin\n\t6.Quit\n");
            Scanner scanner = new Scanner(System.in);
           chosenNumber = scanner.nextInt();
            switch (chosenNumber){
                case 1:
                    myLeftEye.printInfo("Left");
                    break;
                case 2:
                    myRightEye.printInfo("Right");
                    break;

                case 3:
                    myHeart.printInfo();
                    break;

                case 4:
                    myStomach.printInfo();
                    break;

                case 5:
                    mySkin.printInfo();
                    break;

                case 6:
                    System.out.println("GoodBye");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while (chosenNumber != 6);


        }

    }


