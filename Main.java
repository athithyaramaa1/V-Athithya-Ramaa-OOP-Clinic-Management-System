public class Main{
    public static void main(String[] args){
        Doctor doctor = new Doctor();
        Tools tools = new Tools();
        Attender attender = new Attender();
        Furniture furniture = new Furniture();

        doctor.helloDoctor();
        tools.helloTool();
        attender.helloAttender();
        furniture.helloFurniture();
    }
}