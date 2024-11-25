public class NonElectricTool extends Tools {
    public NonElectricTool(String toolName, boolean isElectric, String purpose) {
        super(toolName, false, purpose);
    }  

    @Override
    void helloTool() {
        System.out.println("Hello! I'm a non-electric tool. My name is " + toolName + ", it is non-electric and I am used for " + purpose);
    }
}
