public class Amphibia extends Animals {

    public Amphibia(String name, int age, String environment) {
        super(name, age, environment);
    }

    public String toString() {
        return "Земноводное " + getName() + ". Возраст - " + getAge() + " лет. Среда проживания - " + getEnvironment() + ".";
    }

    @Override
    public void eat() {
        System.out.println("Земноводное " + getName() + " ест.");
    }

    @Override
    public void go() {
        System.out.println("Земноводное " + getName() + " перемещается.");
    }

    public void hunt() {
        System.out.println("Земноводное " + getName() + " охотится.");
    }
}
