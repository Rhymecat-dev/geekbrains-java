package level_two.lesson_one.contestants;

public class Human implements Actionable {

    private int maxRunDistance;
    private int maxJumpDistance;

    public Human(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println("Human successfully ran " + distance);
            return true;
        } else {
            System.out.println("Human didn't make this " + distance + " race!");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= maxJumpDistance){
            System.out.println("Human successfully jumped " + distance);
            return true;
        } else {
            System.out.println("Human didn't make this " + distance + " jump!");
            return false;
        }
    }

}
