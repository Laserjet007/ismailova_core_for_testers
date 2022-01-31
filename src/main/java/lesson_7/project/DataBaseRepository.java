package lesson_7.project;

import lesson_7.project.entity.Weather;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

//создаем подключение к базе данных
public class DataBaseRepository {
    private static final String DB_PATH = "jdbc:sqlite:ismailovadatabase.db";
    private String getWeather = "select * from weather";//чтобы получить погоду нужен:select
    private String insertWeather = "insert into weather (city, localdate, temperature) values (?, ?, ?)";

    static {
        try {
            Class.forName("org.sqlite.JDBC");//статический блок подключения который сработает один раз и его невозможно будет вызвать от куда либо
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean saveWeatherToDataBase(Weather weather) throws SQLException { //два варианта сохранения погоды
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());    //заполняем шаблон значениями
            saveWeather.setString(2, weather.getLocalDate());
            saveWeather.setDouble(3, weather.getTemperature());

            return saveWeather.execute();                                     //сохранение в базу

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Сохранение в базу не выполнено");    //выбрасывание исключения
    }
    public void saveWeatherToDataBase(List<Weather> weatherlist) {
        //вариант принимающий список
    }

    public List<Weather> getSavedToDBWeather() {
        List<Weather> weather = new ArrayList<>();

        try (Connection connection = getConnection(DB_PATH)) { //ресурсный блок , что бы не задумываться о закрытии
            /*connection = DriverManager.getConnection("jdbc:sqlite:ismailovadatabase.db");  // конекшен создаем с помощью класса DriverManager
            Statement statement = connection.createStatement();                  //что бы прогонять строки из базы данных по отдельности нужно создать еще один обьект который будет привязан к основному запросу Statement


            ResultSet resultSet = statement.executeQuery("select * from students"); // показать строки из студентс
            while (resultSet.next()) {                                            //resultSet.next() - нака есть следующий элемент. в цикле пройтись по множеству и показать обьекты
                System.out.print(resultSet.getInt("id"));    // id - взять строчку
                System.out.print(" ");
                System.out.print(resultSet.getString("name"));
                System.out.println();*/
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return weather;//автоматическое сохранение погоды в базу данных
    }
}
