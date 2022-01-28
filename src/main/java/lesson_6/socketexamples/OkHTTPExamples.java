package lesson_6.socketexamples;

//соединение с помощью библиотеки (вроде как легче и читабильней обычных урл конекшенов)
/*
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;



public class OkHTTPExamples {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();// в конструкторе используется патерное проектирование (шаблоны по которым оптимально писать приложения)
                 .newBuilder()             //шаблон билдер (работает с сеторами)
                 .readTimeout()
                 .build();                         //  после ввода параметров означает что обьект построен

        HttpUrl url = new HttpUrl.Builder()         //вместо newBuilder() можно сделать так
                .scheme("https")              //протокол называется схема
                .host("gb.ru")
                .addPathSegment("/courses")    //сигмент пути ( как в предидущих соединениях / или патч)
                .build();

       Request request = new Request.Builder()     //формируем сам запрос
               .url(url)                 //передаем адрес
               .get()//передаем гет запрос
               .build();

       Response response = okHttpClient.newCall(request).execute();//тветет получаем из клиента

        System.out.println(response.code()); // код ответа
        System.out.println(response.headers());

        System.out.println(response.body().string());
    }




}

*/
