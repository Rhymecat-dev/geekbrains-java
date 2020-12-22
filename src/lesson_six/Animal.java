package lesson_six;

public abstract class Animal {

    protected float runDistance;
    protected float jumpDistance;
    protected float swimDistance;

    public Animal(float runDistance, float jumpDistance, float swimDistance) {
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
        this.swimDistance = swimDistance;
    }

    protected boolean run(float distance) {
        return distance <= runDistance;
    }

    protected boolean jump(float distance) {
        return distance <= jumpDistance;
    }

    public abstract boolean swim(float swimDistance);
}
