package lesson_1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim {

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    private boolean isWild;
    private double swimmingSpeed;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public void voice () {
        System.out.println("Mayuuu");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return isWild == cat.isWild;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWild);
    }

    @Override
    public double swim(Pool pool) {
        System.out.println("i cat end i swim!");

        double timeToOvercome = pool.getLength() / swimmingSpeed;
        System.out.println(timeToOvercome);

        return timeToOvercome;
    }
}
