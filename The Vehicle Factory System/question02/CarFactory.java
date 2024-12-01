package question02;

public class CarFactory implements VehicleFactory {
    private static CarFactory instance;

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    @Override
    public Vehicle getModel(String vehicle) {
        if ("Benz".equalsIgnoreCase(vehicle)) {
            return Benz.getInstance();
        }
        return null; // Or handle other car models
    }
}
