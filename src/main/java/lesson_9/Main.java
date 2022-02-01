package lesson_9;

import java.util.ArrayList;
import java.util.List;

//создаем список сотрудников
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Dima", 22, Person.Position.ENGINER));//добавляем список с помощью метода add и создаем в нем обьекты
        personList.add(new Person("Orlov", 62, Person.Position.MANAGER));
        personList.add(new Person("Ilya", 42, Person.Position.DIRECTOR));
        personList.add(new Person("Vova", 32, Person.Position.ENGINER));
        personList.add(new Person("Igor", 29, Person.Position.ENGINER));
        personList.add(new Person("Dimid", 92, Person.Position.MANAGER));

//выбрать только инженеров и отсортировать по возрасту
//у потока списка лист можно вызвать фильтр


    }
}
