public class Tools {
    private String toolName;
    private boolean isElectric;
    private String purpose;

    public Tools(String toolName, boolean isElectric, String purpose){
        this.toolName = toolName;
        this.isElectric = isElectric;
        this.purpose = purpose;
    }
    
    void helloTool(){
        System.out.println("Hello! I'm a tool. My name is " + toolName + ", it is " + (isElectric ? "electric" : "non-electric") + ", and I am used for " + purpose);
    }
}
