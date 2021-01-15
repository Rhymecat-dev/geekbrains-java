package level_two.lesson_one.contestants;

public class Cat implements Actionable {

    private int maxRunDistance;
    private int maxJumpDistance;

    public Cat(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println("Cat successfully ran " + distance);
            return true;
        } else {
            System.out.println("Cat didn't make this " + distance + " race!");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= maxJumpDistance){
            System.out.println("Cat successfully jumped " + distance);
            return true;
        } else {
            System.out.println("Cat didn't make this " + distance + " jump!");
            return false;
        }
    }
}