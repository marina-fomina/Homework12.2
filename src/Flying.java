public class Flying extends Birds {

    public Flying(String name, int age, String environment, String movingType) {
        super(name, age, environment, movingType);
    }

    public String toString() {
        return "Летающая птица " + getName() + ". Возраст - " + getAge() + " лет. Среда проживания - " + getEnvironment() +
                ". Тип передвижения - " + getMovingType() + ".";
    }

    @Override
    public void eat() {
        System.out.println("Летающая птица " + getName() + " ест.");
    }

    @Override
    public void go() {
        System.out.println("Летающая птица " + getName() + " перемещается.");
    }

    public void fly() {
        System.out.println("Летающая птица " + getName() + " летает.");
    }
}
