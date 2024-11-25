public class ClinicReport {
    public static void generateClinicReport() {
        System.out.println("\n---- Clinic Report ----");
        System.out.println("Total number of doctors: " + Doctor.getDoctorCount());
        System.out.println("Total number of attenders: " + Attender.getAttenderCount());
        System.out.println("Total number of tools: " + Tools.getToolCount());
        System.out.println("Total number of furniture: " + Furniture.getFurnitureCount());
        System.out.println("------------------------");
    }
}
