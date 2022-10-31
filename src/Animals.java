import java.util.Objects;

public abstract class Animals {
    private String name;
    private final int age;
    private String environment;
    private static final String DEFAULT_VALUE = "default";

    public Animals(String name, int age, String environment) {
        setName(name);
        this.age = Math.max(age, 1);
        setEnvironment(environment);
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(getName() + " спит.");
    }

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_VALUE);
    }

    public int getAge() {
        return age;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = ValidationUtils.validOrDefault(environment, DEFAULT_VALUE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animals animals = (Animals) o;
        return name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
