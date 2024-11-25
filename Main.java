public class Main {
    public static void main(String[] args) {
        Doctor[] doctors = {
            new Doctor("Dr. Athithya Ramaa", 10, "Pediatrics"),
            new Doctor("Dr. Venkat", 5, "Dermatology"),
            new Doctor("Dr. Strange", 15, "Neurology"),
            new Doctor()
        };

        for(Doctor doctor:doctors){
            doctor.helloDoctor();
            doctor.performDuty();
        }

        // Using accessors and mutators to change the values of the Doctor object

        doctors[1].setName("Dr. Venkatesh");
        System.out.println("The name of the second doctor is updated: " + doctors[1].getName());

        System.out.println("Total number of doctors: " + Doctor.getDoctorCount());

        Attender[] attenders = {
            new Attender("John", 2),
            new Attender("Jane", 3),
            new Attender("Doe", 1),
            new Attender()
        };

        for(Attender attender:attenders){
            attender.helloAttender();
            attender.performDuty();
        }

        // Using accessors and mutators to change the values of the Attender object and showing it in the output
        attenders[1].setYearsOfExperience(5);
        System.out.println("The years of experience of the second attender is updated: " + attenders[1].getYearsOfExperience());

        // System.out.println("Total number of attenders: " + Attender.getAttenderCount());

        Tools[] tools = {
            new Tools("Sthethescope", false, "screwing screws"),
            new Tools("Thermometer", true, "Checking temperature"),
            new Tools("Injection", false, "Injecting people with medicine")
        };

        for(Tools tool:tools){
            tool.helloTool();
        }

        // System.out.println("Total number of tools: " + Tools.getToolCount());

        
        System.out.println("The concept of inheritance:");
        
        System.out.println("Single Inheritance: ");
        
        SeniorDoctor[] seniorDoctors = {
            new SeniorDoctor("Dr. Ram", 25, "Cardiology", "Ph.D. in Cardiology"),
            new SeniorDoctor("Dr. Smith", 30, "Oncology", "MD in Oncology")
        };

        for (SeniorDoctor seniorDoctor : seniorDoctors) {
            seniorDoctor.helloDoctor();
        }

        System.out.println("Hierarchial Inheritance: ");

        DiagnosticTool[] diagnosticTools = {
            new DiagnosticTool("X-Ray Machine", true, "Imaging bones", "Radiology"),
            new DiagnosticTool("Stethoscope", false, "Listening to heartbeats", "Cardiology")
        };
        
        SurgicalTool[] surgicalTools = {
            new SurgicalTool("Scalpel", false, "Cutting", "Cardiac"),
            new SurgicalTool("Laser", true, "Cutting", "Oncology")
        };
        
        for(DiagnosticTool diagnosticTool:diagnosticTools){
            diagnosticTool.helloTool();
        }
        
        for(SurgicalTool surgicalTool:surgicalTools){
            surgicalTool.helloTool();
        }

        Furniture[] furniture = {
            new Furniture("Chair", "Sitting"),
            new Furniture("Multi-purpose table", "Keeping stuff", "Wood"),
            new Furniture("Patient Bed", "Treating patients", "Steel")
        };
        
        for(Furniture furn:furniture){
            furn.helloFurniture();
        }
    
        // System.out.println("Total number of furniture: " + Furniture.getFurnitureCount());

        ClinicReport.generateClinicReport();
    }
}