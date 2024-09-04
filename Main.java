public class Main {
    public static void main(String[] args) {
        Doctor[] doctors = {
            new Doctor("Dr. Athithya Ramaa", 10, "Pediatrics"),
            new Doctor("Dr. Venkat", 5, "Dermatology"),
            new Doctor("Dr. Strange", 15, "Neurology")
        };

        for(Doctor doctor:doctors){
            doctor.helloDoctor();
        }

        System.out.println("Total number of doctors: " + Doctor.getDoctorCount());
        
        Attender[] attenders = {
            new Attender("John", 2),
            new Attender("Jane", 3),
            new Attender("Doe", 1)
        };

        for(Attender attender:attenders){
            attender.helloAttender();
        }

        System.out.println("Total number of attenders: " + Attender.getAttenderCount());

        Tools[] tools = {
            new Tools("Sthethescope", false, "screwing screws"),
            new Tools("Thermometer", true, "Checking temperature"),
            new Tools("Injection", false, "Injecting people with medicine")
        };

        for(Tools tool:tools){
            tool.helloTool();
        }

        System.out.println("Total number of tools: " + Tools.getToolCount());

        Furniture[] furniture = {
            new Furniture("Chair", "Sitting"),
            new Furniture("Multi-purpose table", "Keeping stuff"),
            new Furniture("Patient Bed", "Treating patients")
        };
        
        for(Furniture furn:furniture){
            furn.helloFurniture();
        }
        
        System.out.println("Total number of furniture: " + Furniture.getFurnitureCount());
    }
}
