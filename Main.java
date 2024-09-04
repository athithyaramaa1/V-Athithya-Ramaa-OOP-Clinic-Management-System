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

        Attender[] attenders = {
            new Attender("John", 2),
            new Attender("Jane", 3),
            new Attender("Doe", 1)
        };

        for(Attender attender:attenders){
            attender.helloAttender();
        }

        Tools[] tools = {
            new Tools("Sthethescope", false, "screwing screws"),
            new Tools("Thermometer", true, "Checking temperature"),
            new Tools("Injection", false, "Injecting people with medicine")
        };

        for(Tools tool:tools){
            tool.helloTool();
        }

        Furniture[] furniture = {
            new Furniture("Chair", "Sitting"),
            new Furniture("Multi-purpose table", "Keeping stuff"),
            new Furniture("Patient Bed", "Treating patients")
        };
        
        for(Furniture furn:furniture){
            furn.helloFurniture();
        }
    }
}
