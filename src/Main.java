public class Main {

    private static final Herbivore [] herbivore = new Herbivore[3];
    private static final Predator [] predator = new Predator[3];
    private static final Amphibia [] amphibia = new Amphibia[2];

    private static final Flightless[] flightless = new Flightless[3];
    private static final Flying[] flying = new Flying[3];

    public static void main(String[] args) {
        // Травоядные животные
        System.out.println("Травоядные животные");

        herbivore [0] = new Herbivore("газель", 3, "полупустыни и пустыни", 70, "растения");
        herbivore [1] = new Herbivore("жираф", 7, "саванны и луга", 50, "растения");
        herbivore [2] = new Herbivore("лошадь", 6, "степи, полупустыни, лесостепи", 60, "растения");

        printHerbivores();

        System.out.println("Животное " + herbivore[0].getName() + " входит в " + herbivore[0].getClass() + ".");
        System.out.println("Животное " + herbivore[1].getName() + " входит в " + herbivore[1].getClass() + ".");
        System.out.println("Животное " + herbivore[2].getName() + " входит в " + herbivore[2].getClass() + ".");

        checkUniquenessOfHerbivores();
        herbivore[0].graze();


        // Хищники
        System.out.println("");
        System.out.println("Хищники");

        predator [0] = new Predator("гиена", 2, "саванны", 60, "мясо");
        predator [1] = new Predator("тигр", 5, "леса и степи", 55, "мясо");
        predator [2] = new Predator("медведь", 10, "леса", 45, "мясо");

        printPredators();

        System.out.println("Животное " + predator[0].getName() + " входит в " + predator[0].getClass() + ".");
        System.out.println("Животное " + predator[1].getName() + " входит в " + predator[1].getClass() + ".");
        System.out.println("Животное " + predator[2].getName() + " входит в " + predator[2].getClass() + ".");

        checkUniquenessOfPredators();
        predator[2].eat();

        // Земноводные
        System.out.println("");
        System.out.println("Земноводные животные");

        amphibia [0] = new Amphibia("лягушка", 1, "водоёмы");
        amphibia [1] = new Amphibia("уж пресноводный", 2, "пресные водоёмы");

        printAmphibias();

        System.out.println("Животное " + amphibia[0].getName() + " входит в " + amphibia[0].getClass() + ".");
        System.out.println("Животное " + amphibia[1].getName() + " входит в " + amphibia[1].getClass() + ".");

        checkUniquenessOfAmphibias();
        amphibia[1].hunt();

        // Нелетающие птицы
        System.out.println("");
        System.out.println("Нелетающие птицы");

        flightless [0] = new Flightless("павлин", 4, "джунгли", "ходят");
        flightless [1] = new Flightless("пингвин", 6, "холодные водоемы", "ходят");
        flightless [2] = new Flightless("додо", 3, "джунгли", "ходят");

        printFlightless();

        System.out.println("Животное " + flightless[0].getName() + " входит в " + flightless[0].getClass() + ".");
        System.out.println("Животное " + flightless[1].getName() + " входит в " + flightless[1].getClass() + ".");
        System.out.println("Животное " + flightless[2].getName() + " входит в " + flightless[2].getClass() + ".");

        checkUniquenessOfFlightless();
        flightless[2].walk();

        // Летающие птицы
        System.out.println("");
        System.out.println("Летающие птицы");
        flying[0] = new Flying("чайка", 5, "вблизи водоёмов", "летают");
        flying[1] = new Flying("альбатрос", 15, "вблизи морей и океанов", "летают");
        flying[2] = new Flying("сокол", 10, "полупустыни и степи", "летают");

        printFlying();

        System.out.println("Животное " + flying[0].getName() + " входит в " + flying[0].getClass() + ".");
        System.out.println("Животное " + flying[1].getName() + " входит в " + flying[1].getClass() + ".");
        System.out.println("Животное " + flying[2].getName() + " входит в " + flying[2].getClass() + ".");

        checkUniquenessOfFlying();
        flying[0].eat();
    }

    public static void printHerbivores() {
        for (int index = 0; index < herbivore.length; index++) {
            System.out.println(herbivore[index]);
        }
    }

    public static void checkUniquenessOfHerbivores() {
        for (int index = 0; index < herbivore.length - 1; index++)
            if (herbivore[index].equals(herbivore[index + 1])) {
                System.out.println("В классе 'Травоядные' есть одинаковые животные.");
            }
        System.out.println("В классе 'Травоядные' нет одинаковых животных.");
    }

    public static void printPredators() {
        for (int index = 0; index < predator.length; index++) {
            System.out.println(predator[index]);
        }
    }

    public static void checkUniquenessOfPredators() {
        for (int index = 0; index < predator.length - 1; index++)
            if (predator[index].equals(predator[index + 1])) {
                System.out.println("В классе 'Хищники' есть одинаковые животные.");
            }
        System.out.println("В классе 'Хищники' нет одинаковых животных.");
    }

    public static void printAmphibias() {
        for (int index = 0; index < amphibia.length; index++) {
            System.out.println(amphibia[index]);
        }
    }

    public static void checkUniquenessOfAmphibias() {
        for (int index = 0; index < amphibia.length - 1; index++)
            if (amphibia[index].equals(amphibia[index + 1])) {
                System.out.println("В классе 'Земноводные' есть одинаковые животные.");
            }
        System.out.println("В классе 'Земноводные' нет одинаковых животных.");
    }

    public static void printFlightless() {
        for (int index = 0; index < flightless.length; index++) {
            System.out.println(flightless[index]);
        }
    }

    public static void checkUniquenessOfFlightless() {
        for (int index = 0; index < flightless.length - 1; index++)
            if (flightless[index].equals(flightless[index + 1])) {
                System.out.println("В классе 'Нелетающие птицы' есть одинаковые животные.");
            }
        System.out.println("В классе 'Нелетающие птицы' нет одинаковых животных.");
    }

    public static void printFlying() {
        for (int index = 0; index < flying.length; index++) {
            System.out.println(flying[index]);
        }
    }

    public static void checkUniquenessOfFlying() {
        for (int index = 0; index < flying.length - 1; index++)
            if (flying[index].equals(flying[index + 1])) {
                System.out.println("В классе 'Летающие птицы' есть одинаковые животные.");
            }
        System.out.println("В классе 'Летающие птицы' нет одинаковых животных.");
    }
}