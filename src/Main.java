public class Main {
    public static void main(String[] args) {

        Human men = new Human("Bilal", "Farrukhi", 2, "White", "Tajik", 50, 1.2);

        men.getLastName();
        men.getNationality();
        ///System.out.println(men.getFirstName()+ " " + men.getLastName()+ " " + men.getNationality());

        Animal cat = new Animal("Cat", 1, 1, 1, 50, "asleep");

        System.out.println(cat.getName() + " is " + cat.getWeight()+ "lb");

        Vehicle myCar = new Vehicle("Audi Q7", "3.2L");

        System.out.println(myCar.getName());
// review test
        Audi audi = new Audi();
        audi.steer(45);
        audi.accelerate(30);
        audi.accelerate(20);
        audi.accelerate(-42);

/*
        Men youngMan = new Men("Josh", "Mikov", 23, "Asian", "Tajik", 150, 180);

        youngMan.walk();
        youngMan.coffee("2");
        youngMan.piNumber();
        youngMan.run();
        youngMan.rest();
        youngMan.drink();
*/
        //System.out.println(youngMan.getFirstName()+youngMan.getLastName()+youngMan.getAge()+youngMan.getRace()+youngMan.getNationality()+youngMan.getWeight()+youngMan.getHeight());

/*        ReferencesObjectsInstanceClass house = new ReferencesObjectsInstanceClass("Red");
        ReferencesObjectsInstanceClass myHouse = house;
        System.out.println(house.getColor());
        System.out.println(myHouse.getColor());
        myHouse.setColor("Yellow");
        System.out.println(myHouse.getColor());
        ReferencesObjectsInstanceClass greenHouse = new ReferencesObjectsInstanceClass("Green");
        myHouse = greenHouse;
        System.out.println(house.getColor());
        System.out.println(myHouse.getColor());
        System.out.println(greenHouse.getColor());
*/

/*        PitBull pitBull = new PitBull("Gang", 10, 150, 2, 4, 2, "Gold", 1, 24, "awake" );
        System.out.println(pitBull.getName()+"\n"+pitBull.getSize()+"\n"+pitBull.getWeight()+"\n"+pitBull.getColor()+"\n"+pitBull.getBehaviour()+"\n"+pitBull.getStrength());
        pitBull.getStrength();
        pitBull.getBehaviour();
        Dog dog=new Dog("Max", 5, 100, 2, 4, 2, "Black", 1, 24, "sleep");
        System.out.println(dog.getName());
        dog.eat();
        dog.walk();
        dog.run();*/

    }

}
