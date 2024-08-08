public class Main{
    public static void main(String[] args){
        Doctor doctor = new Doctor("Athithya", 5, "General Physician");
        Tools tools = new Tools("Stheroscope", false, "Listening to heartbeats");
        Attender attender = new Attender("John", 2);
        Furniture furniture = new Furniture("Chair", "For sitting");

        doctor.helloDoctor();
        tools.helloTool();
        attender.helloAttender();
        furniture.helloFurniture();
    }
}