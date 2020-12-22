package lesson_six;

public class Cat extends Animal {

    public Cat(float runDistance, float jumpDistance, float swimDistance) {
        super(runDistance, jumpDistance, swimDistance);
    }

    @Override
    public boolean swim(float swimDistance) {
        System.out.println("Cats can't swim!");
        return false;
    }


}
