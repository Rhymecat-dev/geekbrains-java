package level_two.lesson_one.obstacles;

import level_two.lesson_one.contestants.Actionable;

public class Treadmill implements Dimensionable {

    private int treadMillLength;

    public Treadmill(int treadMillLength){
        this.treadMillLength = treadMillLength;
    }

    @Override
    public boolean canDoThis(Actionable a) {
        return a.run(treadMillLength);
    }
}
