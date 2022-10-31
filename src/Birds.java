public class Birds extends Animals {
    public final String movingType;

    private static final String DEFAULT_VALUE = "default";

public Birds(String name, int age, String environment, String movingType) {
    super(name, age, environment);
    this.movingType = ValidationUtils.validOrDefault(movingType, DEFAULT_VALUE);
}
    public String toString() {
        return "Птица " + getName() + ". Возраст - " + getAge() + " лет. Среда проживания - " + getEnvironment() +
                ". Тип передвижения - " + movingType + ".";
    }

    @Override
    public void eat() {
        System.out.println("Птица " + getName() + " ест.");
    }

    @Override
    public void go() {
        System.out.println("Птица " + getName() + " перемещается.");
    }

    public void hunt() {
        System.out.println("Птица " + getName() + " охотится.");
    }

    public String getMovingType() {
        return movingType;
    }
}
