package question04;

public class SideAirBag implements CarAirBag {

    @Override
    public void airBagMotionDetection() {
        System.out.println("Motion detection enabled for Side Air Bag.");
    }

    @Override
    public void airBagLightIndicator() {
        System.out.println("Light indicator enabled for Side Air Bag.");
    }
}
