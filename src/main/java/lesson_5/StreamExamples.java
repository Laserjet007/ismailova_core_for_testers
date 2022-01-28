package lesson_5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

//байтовые потоки

public class StreamExamples {
    public static void main(String[] args) {
        String tempString = "кот";
        System.out.println((Arrays.toString(tempString.getBytes())));//вывести чистовой код слова кот в консоль

        String tempString1 = "cat";
        System.out.println((Arrays.toString(tempString.getBytes())));//вывести чистовой код слова cat в консоль

        System.out.println(Charset.defaultCharset());//вывести кодировку по умолчанию
        System.out.println(Charset.availableCharsets());// вывести имеющиеся кодировки

        File file = new File("our_example.txt"); // создаем файл

        /*OutputStream stream = null;//вариант закрытия программы с обычным траем, без библиотек джавы
        try {                        // трай кетч - обработка исключений
            stream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

       try (OutputStream outputStream = new FileOutputStream(file)){// ресурсный трай кетч, можно в новой версии джавы обьявить поток а затем его и открыть
       outputStream.write("кот".getBytes(StandardCharsets.UTF_8));//добавить запись из байт в файл

       } catch (FileNotFoundException e) {//для перекрытия потка необходимо его закрывать так как может подсасывать память или вообще блокернуть файл
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();// с этим вариантом запись прекратится и запишит следующую хрень, а то может начать гонять циклом
       }

        /*try (OutputStream outputStream1 = new FileOutputStream(file)) {//открываем еще один стрим путь к этому же файлу
        outputStream1.write(65);//передадим инт -переменную (код буквы а)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try (OutputStream outputStream1 = new FileOutputStream(file, true)) {//вариант - когда слово будет дописываться в конец
            outputStream1.write(65);                                     //append true - записать в конец
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        long time = System.currentTimeMillis();//замерить время записи большого файла 5 мб

       /* try (OutputStream outputStream1 = new FileOutputStream(file, true)) {
            for (int i = 0; i < 5 * 1024 * 1024; i++) { // от 0 до 1000000 ( i меньше 0 и меньше 5 умножить на килобайт и еще раз на килобайт
                outputStream1.write(65);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("время затраченное на запись 5 мг" + (System.currentTimeMillis() - time));*/

// вариант быстрее:
        long time1 = System.currentTimeMillis();//замерить время записи большого файла 5 мб (второй способ быстрее передать файл в поток(воспользоваться буфером)

        try (OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < 5 * 1024 * 1024; i++) { // от 0 до 1000000 ( i меньше 0 и меньше 5 умножить на килобайт и еще раз на килобайт
                outputStream1.write(65);
                //outputStream1.flush();   // сброс (очистка буфера)
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("время затраченное на запись 5 мг с буфером " + (System.currentTimeMillis() - time1));

//вариант как прочитать из файла
        byte[] bytes = null;//массив содержащий набор байт

        try {
            InputStream inputStream = new FileInputStream("1.txt");
            bytes = new byte[inputStream.available()];//заполняем массив
            inputStream.read(bytes);//байтами

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(bytes, StandardCharsets.UTF_8)); //вывести байты в любой кодировке из массива  в консоль

//вариант как прочитать из файла


        try (InputStream inputStream = new FileInputStream("1.txt")) {  //разница с предидущим примером что мы брали там массив а тут пройтем цикл для посимвоьного чтения

            for (int i = 0; i < new File ("1.txt").length(); i++){//цыкл фор (читать до длинны файла)
                System.out.println(i + ": " + (char) inputStream.read());//по байтово читаем и преобразовываем в чар
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    }

