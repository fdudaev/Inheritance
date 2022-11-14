public class ReferencesObjectsInstanceClass {

    /* Class myObject=new Class() // instant of the Class */
    // Analogy of building a house
    // Class  - A class is basically a blueprint for a house, using blueprint(plan) we can build as many houses as we like based on those plans.
    /* public class House{};*/
    // Object - Each house we build (using *new* operator) is an Object also known as an instance.
    /*House myHouse=new House();*/
    //Reference - each house we build has an address(a physical location). This is known as a reference.
    // We can pass REFERENCES as PARAMETERS to CONSTRUCTORS and METHODS.

    private String color;

    public ReferencesObjectsInstanceClass(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

}
