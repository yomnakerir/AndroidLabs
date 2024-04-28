import java.util.Scanner;

public class Eye extends Organ{


    private String color;
    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    public void printInfo(String eyeDirection){
        super.printInfo();
        System.out.println("Color is : " + this.getColor()+"\n\t1.Close the eye");
        Scanner scanner = new Scanner(System.in);
        int selectedNumber = scanner.nextInt();
        if(selectedNumber == 1){
            System.out.println(eyeDirection + " Eye Closed");
        }
    }
    public String getColor() {
        return color;
    }


}
