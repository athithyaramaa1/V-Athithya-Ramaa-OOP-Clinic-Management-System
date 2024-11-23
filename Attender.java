public class Attender extends Staff {

    // Instance variables - private. Accessible only within the class thru accessor and mutator methods
    private static int attenderCount = 0;
    private static String clinicName = "Athithya Clinic";
    

    // Parameterized constructor - public. Accessible outside the class

    public Attender(String name, int yearsOfExperience){
        super(name, yearsOfExperience);
        attenderCount++;
    }

    // Default constructor - public. Accessible outside the class
    public Attender(){
        super("The Hulk", 10);
        attenderCount++;
    }

    // Accessor (getter) methods - public. Accessible outside the class

    public String getName(){
        return name;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    // Mutator (setter) methods - public. Accessible outside the class

    public void setName(String name){
        this.name = name;
    }

    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    static int getAttenderCount(){
        return attenderCount;
    }

    @Override
    public void performDuty(){
        System.out.println("I'm an attender. I assist doctors and patients.");
    }

    void helloAttender(){
        System.out.println("Hello! I'm an attender at " + clinicName + " My name is " + name + " and I have " + yearsOfExperience + " years of experience");
    }
}