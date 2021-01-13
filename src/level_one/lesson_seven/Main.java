package level_one.lesson_seven;

public class Main {

    public static void main(String[] args) {
        Cat cat[] = {new Cat("George", 11), new Cat("Doom", 10)};
        Plate plate = new Plate(20);

        for (Cat c : cat) {
            plate.info();
            c.eat(plate);
            plate.info();
            if (c.getSatiety()){
                System.out.println("Cat " + c.getName() + " isn't hungry!");
            } else {
                System.out.println("Cat " + c.getName() + " is hungry!");
            }
        }
    }
}