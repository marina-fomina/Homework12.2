public class Flightless extends Birds {

    public Flightless(String name, int age, String environment, String movingType) {
        super(name, age, environment, movingType);
    }

    public String toString() {
        return "Нелетающая птица " + getName() + ". Возраст - " + getAge() + " лет. Среда проживания - " + getEnvironment() +
                ". Тип передвижения - " + getMovingType() + ".";
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица " + getName() + " ест.");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица " + getName() + " перемещается.");
    }

    public void walk() {
        System.out.println("Нелетающая птица " + getName() + " гуляет.");
    }
}
