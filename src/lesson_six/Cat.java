package lesson_six;

public class Cat extends Animal {

    public Cat(float maxRunDistance, float maxJumpDistance, float maxSwimDistance) {
        super(maxRunDistance, maxJumpDistance, maxSwimDistance);
    }

    @Override
    public boolean swim(float swimDistance) {
        System.out.println("Cats can't swim!");
        return false;
    }


}
