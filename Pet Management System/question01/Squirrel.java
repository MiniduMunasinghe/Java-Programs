package question01;

public class Squirrel extends Pets {
    private String command;
    private int runCount;

    public Squirrel(String command) {
        super();
        this.command = command;
    }

    @Override
    public void feed() {
        System.out.println("Feeding the Squirrel");
        points += 5;
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Squirrel");
        points += 10;
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddling the Squirrel");
        points += 15;
    }

    public boolean isCaught() {
        try {
            if ("Run".equals(command)) {
                runCount++;
                if (runCount == 5) {
                    throw new CaughtException("Caught");
                }
            }
            return false;
        } catch (CaughtException e) {
            System.out.println("CaughtException: " + e.getMessage());
            return true;
        }
    }

    @Override
    public void GetTotalPoints() {
        if (isCaught()) {
            points = 0;
        }
        System.out.println("Total points: " + points);
    }
}
