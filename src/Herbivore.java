public class Herbivore extends Mammal {

    public Herbivore(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed, foodType);
    }

    public String toString() {
        return "Травоядное животное " + getName() + ". Возраст - " + getAge() + " лет. Среда проживания - "
                + getEnvironment() + ". Скорость перемещения - " + getSpeed() + " км/ч. Тип пищи - " + getFoodType() + ".";
    }

    @Override
    public void eat() {
        System.out.println("Травоядное животное " + getName() + " ест.");
    }

    @Override
    public void go() {
        System.out.println("Травоядное животное " + getName() + " перемещается.");
    }

    public void graze() {
        System.out.println("Травоядное животное " + getName() + " пасётся.");
    }
}
