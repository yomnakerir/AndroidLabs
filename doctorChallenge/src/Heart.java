import java.util.Scanner;

public class Heart extends Organ{

    private int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Heart Rate is: " + this.getHeartRate() +"\n\t1.Change Heart Rate");
        Scanner scanner =  new Scanner(System.in);
        int selectedNumber = scanner.nextInt();
        if(selectedNumber == 1){
            System.out.print("Enter the new heart rate : ");
            int newHeartRate = scanner.nextInt();
            changeHeartRate(newHeartRate);
            System.out.println("Heart Rate Changed to " + this.getHeartRate());
        }
    }

    public int changeHeartRate(int heartRate){
        this.setHeartRate(heartRate);
        return this.getHeartRate();
    }
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
