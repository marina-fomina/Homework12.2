public class Predator extends Mammal {

    public Predator(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed, foodType);
    }

    public String toString() {
        return "Хищник " + getName() + ". Возраст - " + getAge() + " лет. Среда проживания - "
                + getEnvironment() + ". Скорость перемещения - " + getSpeed() + " км/ч. Тип пищи - " + getFoodType() + ".";
    }

    @Override
    public void eat() {
        System.out.println("Хищник " + getName() + " ест.");
    }

    @Override
    public void go() {
        System.out.println("Хищник " + getName() + " перемещается.");
    }

    public void hunt() {
        System.out.println("Хищник " + getName() + " охотится.");
    }
}
