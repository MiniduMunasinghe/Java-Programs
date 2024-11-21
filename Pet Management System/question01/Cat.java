package question01;

public class Cat extends Pets {
    @Override
    public void feed() {
        System.out.println("Feeding the Cat");
        points += 5;
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Cat");
        points += 10;
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddling the Cat");
        points += 15;
    }

    @Override
    public void GetTotalPoints() {
        System.out.println("Total points: " + points);
    }
}
