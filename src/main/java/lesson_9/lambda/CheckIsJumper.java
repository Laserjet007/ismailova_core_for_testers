package lesson_9.lambda;// создаем класс, который будет сравнивать по прыжкам. (умеет прыгать или нет)
//сравниваем этих животных (прыгает ли или бегает) - метод, который будет сравнивать в зависимости от условия, которое передаем
public class CheckIsJumper {

    public boolean test(Animal animal){// на вход принимает анимал
        return animal.isCanJump();
    }

}