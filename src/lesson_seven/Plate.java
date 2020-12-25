package lesson_seven;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodAmount) {
        if (food >= foodAmount) {
            food -= foodAmount;
            return true;
        } else {
            System.out.println("Not enough food!");
            return false;
        }
    }

    public void addFood(int foodAmount) {
        food += foodAmount;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
