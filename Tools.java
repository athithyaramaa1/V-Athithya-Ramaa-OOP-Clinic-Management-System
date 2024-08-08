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
        System.out.println("Hello! I'm a tool");
    }

}
