public class Attender {
    private String name;
    private int yearsOfExperience;
    private static int attenderCount = 0;
    private static String clinicName = "Athithya Clinic";

    public Attender(String name, int yearsOfExperience){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        attenderCount++;
    }

    static int getAttenderCount() {
        return attenderCount;
    }

    void helloAttender(){
        System.out.println("Hello! I'm an attender at! " + clinicName + " My name is " + name + " and I have " + yearsOfExperience + " years of experience");
    }
}
