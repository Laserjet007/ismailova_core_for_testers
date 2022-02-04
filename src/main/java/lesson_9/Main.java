package lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println(personList.stream()                                   //у потока списка лист можно вызвать фильтр сотрудников
                .filter(p -> p.getPosition() == Person.Position.MANAGER)      // в фильтр передается определенное правило по которому ведется фильтрация (берется переменная и сравнивается с строкой из списка)
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())//из этого списка инженеров (что вернулись из предидущего фильтра) отсортировываем (передаем какому принципу сортировать - сравниваем по возрасту, то есть если вычесть возраст из одной персоны то будет не соответствие, а следовательно ищем 0 )
                .collect(Collectors.toList())); // cобрать в коллекцию  в ту лист


    }
}
