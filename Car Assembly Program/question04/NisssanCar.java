package question04;

public class NisssanCar implements Car {

    CarAirBag airBag;

    public NisssanCar(CarAirBag airBag) {
        this.airBag = airBag;
    }

    @Override
    public void assembleLight() {
        System.out.println("Assembling light for Nissan car.");
        airBag.airBagLightIndicator();
    }

    @Override
    public void assembleMotionSensors() {
        System.out.println("Assembling motion sensors for Nissan car.");
        airBag.airBagMotionDetection();
    }
}
