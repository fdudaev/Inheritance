public class SupperAndThis {

    // A constructor can have a call to super() or this() but can't have both.
    //super - The key word Super is used to access/call the parent members(methods and variables)
    //this() - used to call a constructor from another overloaded constructor in the same class. MUST be the first statement in the Constructor
    //this - this is used to call current class member(variables and methods). This is required when we have a parameter with the same name as an instance variable (field).
    //Keyword this is commonly used with constructors and setters, and optionally used with getters.
    /* public class House{
    private Sting color;
    public House(String color){
        this.color=color; // this keyword is required, same as parameter name as field
    }
    public Sting getColor(){
        //this.color=color; // this is optional
        return color;
    }
    public void setColor(String color){
        this.color=color;// this keyword is required, same as parameter name as field
    }
    }
     */


}
