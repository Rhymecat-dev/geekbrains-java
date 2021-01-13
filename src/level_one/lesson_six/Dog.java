package level_one.lesson_six;

public class Dog extends Animal{

    public Dog(float maxRunDistance, float maxJumpDistance, float maxSwimDistance) {
        super(maxRunDistance, maxJumpDistance, maxSwimDistance);
    }

    @Override
    public boolean swim(float distance) {
        return distance <= maxSwimDistance;
    }
}
