public class Doctor {
    private String name;
    private int yearsOfExperience;
    private String specialty;
    
    public Doctor(String name, int yearsOfExperience, String specialty){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.specialty = specialty;
    }

    void helloDoctor(){
        System.out.println("Hey there! I'm a doctor at this Clinic! My name is " + name + " and I have " + yearsOfExperience + " years of experience. My specialty is " + specialty);
    }
}
