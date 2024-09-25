public class Doctor {
    // Instance variables - private. Accessible only within the class thru accessor and mutator methods
    private String name;
    private int yearsOfExperience;
    private String specialty;
    private static String clinicName = "Athithya Clinic";
    private static int doctorCount = 0;
    
    public Doctor(String name, int yearsOfExperience, String specialty){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.specialty = specialty;
        doctorCount++;
    }

    //Accessor (getter) methods - public. Accessible outside the class

    public String getName(){
        return name;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    public String getSpecialty(){
        return specialty;
    }

    //Mutator (setter) methods - public. Accessible outside the class
    public void setName(String name){
        this.name = name;
    }

    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    static int getDoctorCount(){
        return doctorCount;
    }
    
    void helloDoctor(){
        System.out.println("Hey there! I'm a doctor at " + clinicName + "! My name is " + name + 
                           " and I have " + yearsOfExperience + " years of experience. My specialty is " + specialty);
    }
}
