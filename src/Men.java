import java.security.PublicKey;

public class Men extends Human {

    private String beardColor;
    private String hairColor;
    private String maritalStatus;


    public Men(String firstName, String lastName, int age, String race, String nationality, double weight, double height) {
        super(firstName, lastName, age, race, nationality, weight, height);
        this.beardColor = beardColor;
        this.hairColor = hairColor;
        this.maritalStatus = maritalStatus;
    }
    public void piNumber(){
        System.out.println("the pi number is ="+PI*2);
    }
    public void coffee(String cupsADay){
        System.out.println("Men.coffee() called. He drinks: "+cupsADay+" cups of coffee a day");
    }
/*    @Override
    public void coffee(){
        System.out.println("Men.coffee() called");
        super.coffee();
    }*/
    public void rest() {
        System.out.println("Men.rest() called");
        sleep(8);
    }

    public void drinkWater() {
        System.out.println("Man.drinkWater() called");
    }

    @Override
    public void drink(){
        System.out.println("Men.drink() called");
        drinkWater();
        super.drink();
    }

    private void vegan() {
        System.out.println("Men.vegan() called");
    }

    public void walk() {
        System.out.println("Men.walk() called");
        super.move(5);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called/");
        moveLegs(speed);
        super.move(speed);
    }

    public void run() {
        System.out.println("Men.run() called");
        super.move(10);
    }

    @Override
    public void eat() {
        System.out.println("Men.eat() called");
        vegan();
        super.eat();
    }

    public String getHairColor() {
        System.out.println("\n The color of the hair is :" + this.hairColor);
        return getFirstName();
    }

    public String getBeardColor() {
        System.out.println("\n The color of the beard is: " + this.beardColor);
        return beardColor;
    }

    public String getMaritalStatus() {
        System.out.println("\n This man is: " + this.maritalStatus);
        return maritalStatus;
    }


}
