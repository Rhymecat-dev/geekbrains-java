package level_two.lesson_one.obstacles;

import level_two.lesson_one.contestants.Actionable;

public class Wall implements Dimensionable{

    private int wallHeight;

    public Wall(int wallHeight){
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean canDoThis(Actionable a) {
        return a.jump(wallHeight);
    }
}
