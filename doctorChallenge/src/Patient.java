public class Patient {
    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
