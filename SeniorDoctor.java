//Example of single inheritance

public class SeniorDoctor extends Doctor {
    private String qualification;

    public SeniorDoctor(String name, int yearsOfExperience, String specialty, String qualification) {
        super(name, yearsOfExperience, specialty);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    void helloDoctor() {
        System.out.println("Hey there! I'm a senior doctor at " + 
                           "Athithya Clinic! My name is " + getName() + 
                           ", I have " + getYearsOfExperience() + 
                           " years of experience, my specialty is " + getSpecialty() + 
                           ", and my qualification is " + qualification + ".");
    }
}
