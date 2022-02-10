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

//вариант  1. printAnimal(animalList, new CheckIsJumper());//передаем в printAnimal умения прыгать и бегать, что бы метод распечатал только прыгающих

// вариант 2. стрим использование - то же самое (отсееваем по признаку) только упрощенно с помощью стрима
        printAnimal(animalList, new CheckAble() {//что бы не реализовывать класс - делаем Checkable и в нем реализовывать один метод тест
                    @Override
                    public boolean test(Animal animal) {//имплиментим прямо здесь к методу тест,
                        return animal.isCunRun(); //и тут же можем изменить animal.isCunRun что бы сортировать по бегу
                    }
                });

// вариант 3.
        printAnimal(animalList, a -> a.isCunRun());//первым параметром передаем анималлист, во втором передаем признак по которому будем тестировать животных на способности
//для этого необходимо пометить интерфейс тест, что он специальный

// создаем класс CheckIsJumper, который будет сравнивать по прыжкам. Сравниваем этих животных (прыгает ли или бегает) - метод, который будет сравнивать в зависимости от условия, которое передаем
    }
    //создаем метод принтэнимал который будет принимать CheckAble,и некий фильтр который будет принимать показатель каких животных печатать каких нет

    private static void printAnimal(List<Animal> animalList, CheckAble checkAble) {//что бы вызвать из маина делаем его приват
        for (Animal animal : animalList) {   //(проходимся по списку) выборка только прыгающих из списка анималлист
            if (checkAble.test(animal)) {//с помощью ифа вызываем из checkAble - CheckIsJumper (проверяем кто из них прыгает)... реализация тест из checkAble
           System.out.println(animal);//если тест проходит то пишим animal (есле умеет прыгать то выводим на печать)
            }
        }
    }

}
