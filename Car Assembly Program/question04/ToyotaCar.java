package question04;

public class ToyotaCar implements Car {

    CarAirBag airBag;

    public ToyotaCar(CarAirBag airBag) {
        this.airBag = airBag;
    }

    @Override
    public void assembleLight() {
        System.out.println("Assembling light for Toyota car.");
        airBag.airBagLightIndicator();
    }

    @Override
    public void assembleMotionSensors() {
        System.out.println("Assembling motion sensors for Toyota car.");
        airBag.airBagMotionDetection();
    }
}
