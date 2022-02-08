package lesson_9.lambda;

import java.util.ArrayList;
import java.util.List;

//создаем список с животными
public class Main { //имеются два показателя и у всех зверей они разные
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Fish", false, false)); //рыба не бегает не прыгает
        animalList.add(new Animal("Cat", true, true));  //кот и бегает и прыгает
        animalList.add(new Animal("Frog", true, false)); //лягушка прыгает но не бегает
        animalList.add(new Animal("Turtle", false, true));//не прыгает, но бегает

// создаем класс, который будет сравнивать по прыжкам. сравниваем этих животных (прыгает ли или бегает) - метод, который будет сравнивать в зависимости от условия, которое передаем


    }
}
