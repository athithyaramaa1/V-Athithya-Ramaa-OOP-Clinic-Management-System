public class Attender {
    private String name;
    private int yearsOfExperience;

    public Attender(String name, int yearsOfExperience){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    void helloAttender(){
        System.out.println("Hello! I'm an attender at this Clinic! My name is " + name + " and I have " + yearsOfExperience + " years of experience");
    }
}
