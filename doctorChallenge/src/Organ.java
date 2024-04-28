public class Organ {

    private String name;
    private String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void printInfo(){
        System.out.println("Name: " + getName() + "\nMedical Condition: " + getMedicalCondition());
    }

    public String getName() {
        return name;
    }



    public String getMedicalCondition() {
        return medicalCondition;
    }


}
