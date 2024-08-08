public class Furniture {
    private String name;
    private String purpose;

    public Furniture(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }
    
    void helloFurniture() {
        System.out.println("Hello! I'm a piece of furniture. My name is " + name + " and I am used for " + purpose);
    }
}
