package lesson_7;
//абстрактное поле нейм
public class CarElement {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarElement{" +
                "name='" + name + '\'' +
                '}';
    }
}
