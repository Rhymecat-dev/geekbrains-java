package level_one.lesson_six;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(300, 3, 1);
        cat.run(301);
        cat.jump(1);
        cat.swim(2);

        Dog dog = new Dog(600, 1, 2);
        dog.run(500);
        dog.jump(2);
        dog.swim(3);
    }

}