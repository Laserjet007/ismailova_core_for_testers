package lesson_7.project;

import lesson_7.project.entity.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel {  // что бы наследники реализовывали, добавляю метод гет ведер, готорый будет получать погоду с того или иного сервиса
    void getWeather(String selectedCity, Period period) throws IOException;// метод будет получать и адресовывать на интерфес ( с двумя параметрами : город и период

    List<Weather> getSavedToDBWeather();
}
