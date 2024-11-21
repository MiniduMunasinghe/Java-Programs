package question01;

public class Parrot extends Pets {
    private String command;

    public Parrot(String command) {
        this.command = command;
    }

    @Override
    public void feed() {
        System.out.println("Feeding the Parrot");
        points += 5;
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Parrot");
        points += 10;
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddling the Parrot");
        points += 15;
    }

    public boolean isCaught() {
        try {
            if ("Walk".equals(command)) {
                throw new CaughtException("Caught");
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
