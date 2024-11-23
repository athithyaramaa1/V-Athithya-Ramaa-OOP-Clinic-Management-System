public class SurgicalTool extends Tools {
    private String surgeryType;

    public SurgicalTool(String toolName, boolean isElectric, String purpose, String surgeryType){
        super(toolName, isElectric, purpose);
        this.surgeryType = surgeryType;
    }

    public String getSurgeryType(){
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType){
        this.surgeryType = surgeryType;
    }

    @Override
    void helloTool(){
        System.out.println("Hello! I'm a surgical tool. My name is " + toolName + ", it is " + (isElectric ? "electric" : "non-electric") + ", and I am used for " + purpose + ". I am used for " + surgeryType + " surgery");
    }
}
