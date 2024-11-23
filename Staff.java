public abstract class Staff {
    protected String name;
    protected int yearsOfExperience;

    public Staff(String name, int yearsOfExperience){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void performDuty();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Years of Experience: " + yearsOfExperience);
    }
}