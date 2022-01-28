package lesson_4;

import java.util.*;

public class Cat implements Comparable<Cat> {
    private String  name;
    private int age;
    private  int weight;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {   //преобразовывает обьект в строку по алгоритму
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {//проверяет что два обьекта ровны по параметрам (по умолчанию сравниваются ссылки)
        if (this == o) return true;   // если ссылки ровны - то говорим что равны
        if (o == null || getClass() != o.getClass()) return false;  // если нулл или другого класса то точно фолз
        Cat cat = (Cat) o;                             // приведение типов к равенству обьекта О
        return age == cat.age && Objects.equals(name, cat.name);  //сравниваем типы (строки нельза сравнить так как будут сравниваться ссылки) поэтому сравниваем еквалсим
    }

    @Override
    public int hashCode() {   //считает хеш от обьекта (от имени и возраста кота будет генериться определенная строчка)
        return Objects.hash(name, age, weight);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Test",1, 3);
        Cat cat2 = new Cat("Test",1, 4);
        Cat cat3 = new Cat("Test",1, 10);
        Cat cat4 = new Cat("Test",7, 101);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());

        HashSet<Cat> catHashSet = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4));// сравнение хешей обьектов
        System.out.println(catHashSet);

        HashSet<Integer> integerHashSet= new HashSet<>(Arrays.asList(1, 3, 5, 6, 7, 22, 4, 1 ,6)); // пример с хеш линком - убедиться что там у нас сохраняется порядок и отбрасывается все лишнее
        System.out.println(integerHashSet);

        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 3, 5, 6, 7, 22, 4, 1 ,6));
        System.out.println(integerLinkedHashSet);

        TreeSet<Integer> integerTreeSet = new TreeSet<>(Arrays.asList(1, 3, 5, 6, 7, 22, 4, 1 ,6));
        System.out.println(integerTreeSet);

        TreeSet<Cat> catTreeSet = new TreeSet<>(Arrays.asList(cat1, cat2, cat3, cat4));//сравнить по дереву
        System.out.println(catTreeSet);

        TreeSet<Cat> catTreeSet1 = new TreeSet<>(new CatComparatorByWeight());
        catTreeSet1.add(cat1);
        catTreeSet1.add(cat2);
        catTreeSet1.add(cat3);
        catTreeSet1.add(cat4);

        System.out.println(catTreeSet1);

    }

    @Override
    public int compareTo(Cat o) {
        return weight - o.getWeight();
    }


}
