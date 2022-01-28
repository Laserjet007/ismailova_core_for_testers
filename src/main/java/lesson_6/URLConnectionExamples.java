package lesson_6;
//пример работы юрл конекшена
/*
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConnectionExamples {
    public static void main(String[] args) throws IOException {//открываем точку входа
        URL url = new URL("https", "gb.ru", "/" );//адрес к которому обращаемся и вариант конструктора в три строки. / - обращение к корню сайта

        InputStream in = url.openStream();//настроить поток от клиента к гб серверу
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));//построчно считываем буфером и выводим код страницы гб

        String line;
        while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
    }
         bufferedReader.close();//закрываем поток что бы не делать трай кетч

    //еще один пример на примере бронировани отеля: передаем параметры в теле запроса
        URL url1 = new URL("https://restful-booker.herokuapp.com/auth");//зтот сервис требует работы в аштиэмэль запросе - подключаемся к адресу

        HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();// в теле запроса передаем джейсон с аутивеникацией. соединение с помощью аштитипи запроса (создаем конекшен)
         //проставляем некие параметры:
        httpURLConnection.setRequestProperty("Content-Type", "application/json");//сформировываем https конекшен (ключ значение) , то зто запрашиваем берется из апи описания
        httpURLConnection.setRequestMethod("POST"); //отправим логин пароль и со стороны сервера создасться токен (ключ по которому будем дальше стучаться)
        httpURLConnection.setDoOutput(true);//получить ответ

        String requestBody = "{\n" +               //формируем тело запроса  вориате  json (пары : члюч:значение экранируем под джава \n  \) и передаем его
                             "  \"username\":\"admin\",\n" +
                             "  \"password\":\"password123\"\n" +
                             "   }";

        BufferedWriter bufferedWriter = BufferedWriter(  //вставляем в запрос реквестбоди
                new OutputStreamWriter(httpURLConnection.getOutputStream());

                bufferedWriter.write(requestBody);

                BufferedReader bufferedReader1 = new BufferedReader(
                        new InputStreamReader(httpURLConnection.getInputStream()));//получение ответа. передаем входной поток

        String temp; //куда сохранять
            while ((temp = bufferedReader1.readLine()) != null); { //считывае ответ
            System.out.println(temp);

        }
    }
}*/

// получаем ответ в виде джейсона
//c помощью мавина (pom.xml) подключим стороннюю библиотеку как вариант более простого подключения без длгой писанины
//переходим на mvnrepository.com  и скачиваем стороннюю библиотеку okhttp