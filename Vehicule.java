public class Vehicule {

    public Vehicule() {}

    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            throw new TooFastException(speed);
        }
        System.out.println("Speed OK: " + speed);
    }

    public static void main(String[] args) {
        Vehicule v = new Vehicule();

        try {
            v.testSpeed(70);
            v.testSpeed(120);
        } catch (TooFastException e) {
            e.printStackTrace(); // displays call stack
        }
    }
}
