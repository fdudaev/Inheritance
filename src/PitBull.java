public class PitBull extends Dog{

    private String behaviour;
    private int strength;

    public PitBull(String name, int size, int weight, int eyes, int legs, int ears, String color, int tail, int teeth, String state) {
        super(name, size, weight, eyes, legs, ears, color, tail, teeth, state);
        this.behaviour=behaviour;
        this.strength=strength;
    }

    public String getBehaviour(){
        System.out.println("PitBulls can be very aggressive" );
        return behaviour;
    }
    public int getStrength(){
        System.out.println("PitBulls are one of the strongest dogs");
        return strength;
    }

}
