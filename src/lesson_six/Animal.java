package lesson_six;

public abstract class Animal {

    protected float maxRunDistance;
    protected float maxJumpDistance;
    protected float maxSwimDistance;

    public Animal(float maxRunDistance, float maxJumpDistance, float maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    protected boolean run(float distance) {
        return distance <= maxRunDistance;
    }

    protected boolean jump(float distance) {
        return distance <= maxJumpDistance;
    }

    public abstract boolean swim(float swimDistance);
}
