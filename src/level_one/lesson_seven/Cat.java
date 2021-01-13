package level_one.lesson_seven;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
       setSatiety(p.decreaseFood(appetite));
    }

    public String getName() {
        return name;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean getSatiety(){
        return satiety;
    }
}
