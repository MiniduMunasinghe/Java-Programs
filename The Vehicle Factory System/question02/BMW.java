package question02;

public class BMW implements ICar {
    private static BMW instance;

    private BMW() {}

    public static BMW getInstance() {
        if (instance == null) {
            instance = new BMW();
        }
        return instance;
    }

    @Override
    public void displayVehicle() { // Corrected the method name
        System.out.println("Factory turns out BMW car.");
    }
}
