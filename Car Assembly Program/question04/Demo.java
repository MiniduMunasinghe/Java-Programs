package question04;

public class Demo {
    public static void main(String[] args) {

        CarAirBag frontAirBag = new FrontAirBag();
        CarAirBag sideAirBag = new SideAirBag();

        Car nissanWithFrontAirBag = new NisssanCar(frontAirBag);
        Car nissanWithSideAirBag = new NisssanCar(sideAirBag);

        Car toyotaWithFrontAirBag = new ToyotaCar(frontAirBag);
        Car toyotaWithSideAirBag = new ToyotaCar(sideAirBag);

        // Nissan Cars
        nissanWithFrontAirBag.assembleLight();
        nissanWithFrontAirBag.assembleMotionSensors();

        nissanWithSideAirBag.assembleLight();
        nissanWithSideAirBag.assembleMotionSensors();

        // Toyota Cars
        toyotaWithFrontAirBag.assembleLight();
        toyotaWithFrontAirBag.assembleMotionSensors();

        toyotaWithSideAirBag.assembleLight();
        toyotaWithSideAirBag.assembleMotionSensors();
    }
}
