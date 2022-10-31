public class Mammal extends Animals {

    private int speed;
    private final String foodType;
    private static final String DEFAULT_VALUE = "default";

    public Mammal(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment);
        setSpeed(speed);
        this.foodType = ValidationUtils.validOrDefault(foodType, DEFAULT_VALUE);
    }

    public String toString() {
        return "Млекопитающее " + getName() + ". Возраст - " + getAge() + " лет. Среда проживания - "
                + getEnvironment() + ". Скорость перемещения - " + speed + " км/ч. Тип пищи - " + foodType + ".";
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающее " + getName() + " ест.");
    }

    @Override
    public void go() {
        System.out.println("Млекопитающее " + getName() + " перемещается.");
    }

    public void walk() {
        System.out.println("Млекопитающее " + getName() + " гуляет.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed > 0 ? speed : 20;
    }

    public String getFoodType() {
        return foodType;
    }
}
