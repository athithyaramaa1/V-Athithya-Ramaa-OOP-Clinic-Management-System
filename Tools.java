public class Tools {
    private String toolName;
    private boolean isElectric;
    private String purpose;
    private static int toolCount = 0;

    public Tools(String toolName, boolean isElectric, String purpose){
        this.toolName = toolName;
        this.isElectric = isElectric;
        this.purpose = purpose;
        toolCount++;
    }
    
    static int getToolCount(){
        return toolCount;
    }

    void helloTool(){
        System.out.println("Hello! I'm a tool. My name is " + toolName + ", it is " + (isElectric ? "electric" : "non-electric") + ", and I am used for " + purpose);
    }
}
