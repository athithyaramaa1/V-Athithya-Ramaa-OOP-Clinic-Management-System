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

    // Accessor (getter) methods

    public String getName(){
        return name;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    // Mutator (setter) methods

    public void setName(String name){
        this.name = name;
    }

    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    static int getAttenderCount(){
        return attenderCount;
    }

    void helloAttender(){
        System.out.println("Hello! I'm an attender at! " + clinicName + " My name is " + name + " and I have " + yearsOfExperience + " years of experience");
    }
}