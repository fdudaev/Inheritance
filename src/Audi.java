public class Audi extends Car {
    private int roadService;

    public Audi() {
        super("Q7", "4WD", 5, 5, 7, false);
        this.roadService = roadService;
    }

    public int getRoadService() {
        return roadService;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGears(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGears(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGears(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGears(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGears(4);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGears(5);
        } else {
            changeGears(6);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
