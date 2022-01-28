package lesson_6.socketexamples;
//бронирование номеров пример работы ок
//пример работы конекшена окаштитипи
/*
import okhttp3.*;
import java.io.IOException;

public class RestfulBookerExamples {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl httpUrl = new HttpUrl.Builder()        //строим урл к букеру
                .scheme("https")              //протокол называется схема
                .host("restful-booker.herokuapp.com")
                .addPathSegment("auth")    //сигмент пути ( как в предидущих соединениях / или патч)
                .build();

        String authBody = "{\n" +               //формируем тело запроса  вориате  json (пары : члюч:значение экранируем под джава \n  \) и передаем его
                "  \"username\":\"admin\",\n" +
                "  \"password\":\"password123\"\n" +
                "   }";

        RequestBody requestBody = RequestBody.create(authBody, MediaType.parse("JSON"));

        Request request = new Request.Builder()
                .url(httpUrl)
                .addHeader("Content-Type", "application/json")
                .post(requestBody)
                .build();

       Response responseAuth = okHttpClient.newCall(request).execute();

       System.out.println(responseAuth.isSuccessful());

       String responseWithToken = responseAuth.body().string();

        System.out.println(responseWithToken);

        String token = responseWithToken.split(":")[1];    // метод сплит возвращает массив и делит на кусочки токен : пароль... берем первый [1]
       // token = token.replace("\"", "");//избавляемся от кавычки
       // token = token.replace("}", "");   // избавляемся от закрывающей точки

        token = token.replaceAll("[\"}]", "");//предидущие выдергивание по символам можно  обработать регулярным выражением (шаблоном по которому система ищет совпадения) .. квадратные скобки означают выбор того чего надо заэкранировать... символы ничем не разделяются

        System.out.println(token);

        String createBookingJson = "{\n" +    // теперь необходимо отправить токен букера для бронирования номера
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "    \"checkin\" : \"2018-01-01\",\n" +
                "    \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RequestBody requestCreateBookingBody = RequestBody.create(createBookingJson, MediaType.parse("JSON")); //формируем запрос  так же как выше делал

// все данные берутся из апи

        Request requestCreateBooking = new Request.Builder()
            .url("restful-booker.herokuapp.com/booking")
            .addHeader("Content-Type", "application/json")
            .addHeader("Accept", "application/json")
            .addHeader("Cookie", String.format("token=%s", token))
            .post(requestCreateBookingBody)
            .build();

        Response response = okHttpClient.newCall(requestCreateBooking).execute();//в клиенте  делаем новый вызов и выпол няем его

        System.out.println(response.body().string());//вывод из запроса тела реализую строкой
// результатом сформировывается айдишник в джейсоне и инфа которую туда накидал
    }
}
*/