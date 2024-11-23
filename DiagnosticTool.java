public class DiagnosticTool extends Tools{
    private String diagnosis;

   public DiagnosticTool(String toolName, boolean isElectric, String purpose, String diagnosis){
       super(toolName, isElectric, purpose);
       this.diagnosis = diagnosis;
   }

    public String getDiagnosis(){
         return diagnosis;
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

    @Override
    void helloTool(){
        System.out.println("Hello! I'm a diagnostic tool. My name is " + toolName + ", it is " + (isElectric ? "electric" : "non-electric") + ", and I am used for " + purpose + ". I diagnose " + diagnosis);
    }

}
