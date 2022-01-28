package lesson_7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//пишим клиенскую часть приложения которая обращается к серверу и получает с него данные и их отображать

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
       ObjectMapper objectMapper = new  ObjectMapper();  //класс ObjectMapper позволяет сравнивать данные что есть в джейсоне с тем с чем работаем в джаве
// переделываем обьект кар в джейсон обьект c помощью objectMapper
        Car car = new Car("Red", "Porsche");
        String carFromJSON = objectMapper.writeValueAsString(car);
        System.out.println(carFromJSON);

//проделать перидущую операцию и собрать обьект из джейсона
        Car car1 = objectMapper.readValue(carFromJSON, Car.class);
        System.out.println(car1); //из за реализации ту стринг из маин - пишим просто кар1

       // ВАРИАНТ НЕ СО СТРОКОЙ КАК В ПРЕДИДУЩЕМ ВАРИАНТЕ - А С СПИСКОМ (вариант посложнее)

//создаем список и заполняем его (создаем стрингу с ждейсон формата и далее распарсить ее)
        List<Car> carList = new ArrayList<>(Arrays.asList(new Car("Green","Ferrari"),
                new Car("Gray", "BMW")));
        System.out.println(carList);

        String carListJSON = objectMapper.writeValueAsString(carList);
        System.out.println(carListJSON);

//теперь наобарот из джейсона распарсить в список обьектов
        List<Car> carsFromJSON = objectMapper.readValue(carListJSON, new TypeReference<ArrayList<Car>>() { });//List<Car> carsFromJSON-сохраняем в список .передаем как список, причем типезированный (ссылочный тип com.fasterxml.jackson.core....)
        System.out.println(carsFromJSON);

        //Еще один вариант со своей особенностью
        String jsonCarAfterUpdate = "{\"color\":\"Белый\",\"type\":\"Lada\",\"year\":\"Lada\"}";//берется некий джейсон и из него необходимо к примеру собрать обьект
     // закрываем для второго варианта:
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);//конфигурируем обжектмеджек таким образом что бы он не обрабатывал YEAR. десерилизируем и изменяем труе на фальсе в FAIL_ON_UNKNOWN_PROPERTIES
        Car carAfterUpdate = objectMapper.readValue(jsonCarAfterUpdate, Car.class);
        System.out.println(carAfterUpdate); //Car{color='Белый', type='Lada'}   в итоге получается такой джейсон

     //пример когда програмист рефакторит одно из полей (не будет ошибки потому что стоит игнор)
        String jsonCarAfterRefactoring = "{\"color\":\"Белый\",\"model\":\"Lada\"}";
        Car carAfterRefactoring = objectMapper.readValue(jsonCarAfterRefactoring, Car.class);
        System.out.println(carAfterRefactoring); //Car{color='Белый', type='null'}    в итоге получается такой джейсон, а после рефакторинга и вставки анотации в конструкторе получается Car{color='Белый', type='Lada'}

//пример следующий - создаем автомобиль с сиденьями (передаем два параметра + засетить сиденья)
        Car carWithSeat = new Car("Black", "Ford");
        carWithSeat.setSeat(new Seat(5));//добавляем сидение
     //теперь превращаем это в джейсон и затем обратно
        String carsWithSeatJSON = objectMapper.writeValueAsString(carWithSeat);
        System.out.println(carsWithSeatJSON);//{"color":"Black","seat":{"name":"сидение","seatCount":5},"model":"Ford"}  в итоге получается такой джейсон
//преобразование в обратную сторону (обьект из джейсона)
        Car carWithSeatFromJSON = objectMapper.readValue(carsWithSeatJSON, Car.class);
        System.out.println(carWithSeatFromJSON);//Car{color='Black', type='Ford', seat=Seat{seatCount=5} CarElement{name='сидение'}}





    }
}
