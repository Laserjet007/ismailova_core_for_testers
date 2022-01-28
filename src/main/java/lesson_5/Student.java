package lesson_5;

//пример как прать, читать параметры обьекта

import java.io.Serializable;

public class Student implements Serializable {//чля того что бы читать из serializacionexample параметры обьекта имплементируем (пометим что он сериализуем)
    private  String nameOfStudent;
    private  String surname;
    private int age;
    private transient String sberCart = "1234 4567 8901 2345"; // transient - закрываем параметры в серилизации
    private String friendName;

    public Student(String nameOfStudent, String surname, int age) {// конструктор
        this.nameOfStudent = nameOfStudent;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sberCart='" + sberCart + '\'' +
                ", friendName='" + friendName + '\'' +
                '}';
    }

    public String getSberCart() {
        return sberCart;
    }

    public void setSberCart(String sberCart) {
        this.sberCart = sberCart;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public Student(String nameOfStudent, String surname, int age, String sberCart, String friendName) {
        this.nameOfStudent = nameOfStudent;
        this.surname = surname;
        this.age = age;
        this.sberCart = sberCart;
        this.friendName = friendName;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
