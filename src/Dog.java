public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int ears;
    private String color;
    private int tail;
    private int teeth;


    public Dog(String name, int size, int weight, int eyes, int legs, int ears, String color, int tail, int teeth, String state) {
        super(name, 1, 1, size, weight, state);
        this.eyes = eyes;
        this.legs = legs;
        this.color = color;
        this.ears = ears;
        this.tail = tail;
        this.teeth = teeth;

    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);

    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getEars() {
        return ears;
    }

    public String getColor() {
        return color;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

}
