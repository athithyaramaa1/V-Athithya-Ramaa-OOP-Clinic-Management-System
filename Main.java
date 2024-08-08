public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Athithya", 5, "General Physician");
        Tools tools = new Tools("Stethoscope", false, "Listening to heartbeats");
        Attender attender = new Attender("John", 2);
        Furniture furniture = new Furniture("Chair", "sitting");

        doctor.helloDoctor();
        tools.helloTool();
        attender.helloAttender();
        furniture.helloFurniture();
    }
}
