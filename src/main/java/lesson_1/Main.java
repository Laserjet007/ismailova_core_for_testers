package lesson_1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "wite", -10);

        System.out.println(cat1);

        Cat cat2 = new Cat("Morris", "black", 1);
        Cat cat3 = new Cat("Morris", "black", 1);

        System.out.println(cat2.equals(cat3));

        cat1.setAge(-1);

        System.out.println(cat1);

        Wolf wolf = new Wolf("Trevor", "grey", 6);
        Animal cat4 = new Cat("Morris", "red", 10);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        }

        Cat cat5 = new Cat("Morris", "red", 10);
        Cat cat6 = new Cat("Morris", "red", 10);

        cat5.setWild(true);

        System.out.println(cat5.hashCode());
        System.out.println(cat6.hashCode());

    }
}
