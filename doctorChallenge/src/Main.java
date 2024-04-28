// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Eye rightEye = new Eye("Right Eye", "normal", "blue");
        Eye leftEye = new Eye("Left Eye", "short sighted", "blue");
        Heart heart = new Heart("Heart", "normal", 75);
        Stomach stomach = new Stomach("Stomach", "pud");
        Skin skin = new Skin("Skin", "Burned");

        Patient fullPatientInfo = new Patient("Tom", 25,leftEye, rightEye, heart, stomach, skin);
        display(fullPatientInfo.getName(), fullPatientInfo.getAge() , leftEye, rightEye, heart, stomach, skin);
    }


     static void display(String name, int age,  Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin){

        int chosenNumber = 0;

        do {
            System.out.println("\nName: "+name + "\nAge: "+ age+"\nChoose an organ: \n" +
                    "\t1.Left Eye\n\t2.Right Eye\n\t3.Heart\n\t4.Stomach\n\t5.Skin\n\t6.Quit\n");
            Scanner scanner = new Scanner(System.in);
           chosenNumber = scanner.nextInt();
            switch (chosenNumber){
                case 1:
                   leftEye.printInfo("Left");
                    break;
                case 2:
                   rightEye.printInfo("Right");
                    break;

                case 3:
                    heart.printInfo();
                    break;

                case 4:
                    stomach.printInfo();
                    break;

                case 5:
                    skin.printInfo();
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


