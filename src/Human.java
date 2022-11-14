public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private String race;
    private String nationality;
    private double weight;
    private double height;

    public Human(String firstName, String lastName, int age, String race, String nationality, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.race = race;
        this.nationality = nationality;
        this.weight = weight;
        this.height = height;
    }
    public static final double PI=3.14159;
    public void sleep(int hours){
        System.out.println("Human.sleep() called. Human must sleep at least "+hours+" hours a day");
    }
    public void drink(){
        System.out.println("Human.drink() called");
    }
    public void coffee(){
        System.out.println("Human.coffee() called");
    }
    public void eat() {
        System.out.println("Man.eat() method called from Human class ");
    }
    public void move(int speed){
        System.out.println("Human.move() being called. Human is moving at: "+speed+"mph");
    }
    public String getFirstName() {
        System.out.println("First Name is: " + this.firstName);
        return firstName;
    }

    public String getLastName() {
        System.out.println("\nLast Name is: " + this.lastName);
        return lastName;
    }

    public int getAge() {
        System.out.println("\nHe is; " + this.age + " years old!");
        return age;
    }

    public String getRace() {
        System.out.println("\nHe is " + this.race + " male!");
        return race;
    }

    public String getNationality() {
        System.out.println("\nHis nationality is: " + this.nationality);
        return nationality;
    }

    public double getWeight() {
        System.out.println("\nHe currently weights: " + this.weight + "lb");
        return weight;
    }

    public double getHeight() {
        System.out.println(", and he is: " + this.height + "ft tall");
        return height;
    }
}
