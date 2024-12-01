package question02;

public class VehicleProducer {
    public static VehicleFactory getFactory(String choice) {
        if ("Car".equalsIgnoreCase(choice)) {
            return CarFactory.getInstance();
        } else if ("Bus".equalsIgnoreCase(choice)) {
            return BusFactory.getInstance();
        }
        return null;
    }
}
