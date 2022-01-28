package lesson_1;

public class Turtle extends Animal implements CanSwim {

    private int swimmingSpeed;

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String toString() {
        return "Turtle {" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }
    public void voice () {
        System.out.println("Puc puc");
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public double swim(Pool pool) {
        System.out.println("i turtle end i swim!");

        double timeToOvercome = pool.getLength() / swimmingSpeed;
        System.out.println("Turtle work time:" + timeToOvercome);

        return timeToOvercome;
    }
}
