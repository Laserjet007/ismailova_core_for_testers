package lesson_9;


//создание списка сотрудников
public class Person {
    private String name;
    private int age;
    private Position position;

    enum Position {                                           //перечисляемый тип списком
        ENGINER, MANAGER, DIRECTOR
    }

    public Person(String name, int age, Position position) {    //конструктор
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }
}
