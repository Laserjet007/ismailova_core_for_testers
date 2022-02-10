package lesson_9.lambda;
//что бы не делать конструктор в классе CheckIsJumper сделаем интерфейс чековым

public interface CheckAble {//для сравнения во стрим ап, необходимо пометить интерфейс тест, что он специальный ... (вариант сравнения №3 из маин)

    boolean test(Animal animal);
}
