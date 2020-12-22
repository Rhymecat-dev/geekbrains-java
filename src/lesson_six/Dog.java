package lesson_six;

public class Dog extends Animal{

    public Dog(float runDistance, float jumpDistance, float swimDistance) {
        super(runDistance, jumpDistance, swimDistance);
    }

    @Override
    public boolean swim(float distance) {
        return distance <= swimDistance;
    }
}
