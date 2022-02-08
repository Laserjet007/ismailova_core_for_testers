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

        printAnimal(animalList, new CheckIsJumper());//передаем в printAnimal умения прыгать и бегать, что бы метод распечатал только прыгающих


// создаем класс CheckIsJumper, который будет сравнивать по прыжкам. Сравниваем этих животных (прыгает ли или бегает) - метод, который будет сравнивать в зависимости от условия, которое передаем


    }
    //создаем метод принтэнимал который будет принимать CheckAble,и некий фильтр который будет принимать показатель каких животных печатать каких нет

    private static void printAnimal(List<Animal> animalList, CheckAble checkAble) {//что бы вызвать из маина делаем его приват
        for (Animal animal : animalList) {   //(проходимся по списку) выборка только прыгающих из списка анималлист
            if (checkAble.test(animal)) {//с помощью ифа вызываем из checkAble - CheckIsJumper (проверяем кто из них прыгает)
           System.out.println(animal);//если тест проходит то пишим animal
            }
        }
    }

}
