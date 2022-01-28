package lesson_1;

public class Wolf extends Animal {
    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Wolf {" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public void voice () {
        System.out.println("Uuuuuuuu");
    }
}