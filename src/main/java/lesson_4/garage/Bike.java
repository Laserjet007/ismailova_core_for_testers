package lesson_4.garage;

public class Bike extends Vehicle{
    private  int value;

    public Bike(String model, int power) {
        super(model, power);
    }

    public Bike(String model, int power, int value) {
        super(model, power);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "value=" + value +
                "} " + super.toString();
    }
}
