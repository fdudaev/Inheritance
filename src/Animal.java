public class Animal {
    private String name; // instance variable aka field
    private int brain;
    private int body;
    private int size;
    private int weight;

    private String state;

    public Animal(String name, int brain, int body, int size, int weight, String state) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.state=state;
    }
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at "+speed+"mph");
    }
    public String getName(){
        return name;
    }
    public int getBrain(){
        return brain;
    }
    public int getBody() {
        return body;
    }
    public int getSize() {
        return size;
    }
    public int getWeight() {
        return weight;
    }
    private String getState(){
        return state;
    }

}