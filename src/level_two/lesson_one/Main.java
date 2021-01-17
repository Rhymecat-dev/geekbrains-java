package level_two.lesson_one;

import level_two.lesson_one.contestants.Actionable;
import level_two.lesson_one.contestants.Cat;
import level_two.lesson_one.contestants.Human;
import level_two.lesson_one.contestants.Robot;
import level_two.lesson_one.obstacles.Dimensionable;
import level_two.lesson_one.obstacles.Treadmill;
import level_two.lesson_one.obstacles.Wall;

public class Main {

    public static void main(String[] args) {
        Actionable[] actionable = {
                new Cat(30, 50),
                new Human(20, 50),
                new Robot(5, 50)
        };

        Dimensionable[] dimensionables = {
                new Treadmill(20),
                new Wall(40)
        };

        for (Actionable a : actionable) {
            for (Dimensionable d : dimensionables) {
                if (!d.canDoThis(a)) {
                    break;
                }
            }
        }
    }
}
