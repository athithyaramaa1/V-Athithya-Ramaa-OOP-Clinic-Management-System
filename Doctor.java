public class Doctor {
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

    static int getDoctorCount(){
        return doctorCount;
    }
    
    void helloDoctor(){
        System.out.println("Hey there! I'm a doctor at " + clinicName + "! My name is " + name + 
                           " and I have " + yearsOfExperience + " years of experience. My specialty is " + specialty);
    }
}
