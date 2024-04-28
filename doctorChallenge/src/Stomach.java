import java.util.Scanner;

public class Stomach extends Organ{

    public Stomach(String name, String medicalCondition) {
        super(name, medicalCondition);

    }

    public void digest (){
        System.out.println("Digesting begin .......");
    }

    @Override
    public void printInfo() {

        if(this.getMedicalCondition().equals("PUD") || this.getMedicalCondition().equals("pud")){
            super.printInfo();
            System.out.println("Need to be fed\n\t1.Digest");
            Scanner scanner = new Scanner(System.in);
            int selectedNumber = scanner.nextInt();
            if(selectedNumber == 1){
                this.digest();
            }

        }
        else {
            super.printInfo();
        }

    }
}
