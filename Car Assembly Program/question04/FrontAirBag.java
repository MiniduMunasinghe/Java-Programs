package question04;

public class FrontAirBag implements CarAirBag {

    @Override
    public void airBagMotionDetection() {
        System.out.println("Motion detection enabled for Front Air Bag.");
    }

    @Override
    public void airBagLightIndicator() {
        System.out.println("Light indicator enabled for Front Air Bag.");
    }
}
