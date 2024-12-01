package question02;

public class BusFactory implements VehicleFactory {
    private static BusFactory instance;

    private BusFactory() {}

    public static BusFactory getInstance() {
        if (instance == null) {
            instance = new BusFactory();
        }
        return instance;
    }

    @Override
    public Vehicle getModel(String vehicle) {
        // Logic for bus models can be added here
        return null;
    }
}
