package question01;

public abstract class Pets implements PointAllocator {
    protected int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public abstract void feed();
    public abstract void clean();
    public abstract void cuddle();
    public abstract void GetTotalPoints();
}
