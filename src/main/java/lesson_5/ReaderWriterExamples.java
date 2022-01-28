package lesson_5;

//символьные потоки (возможности использования)

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ReaderWriterExamples {
    public static void main(String[] args) throws FileNotFoundException {     //точка входа
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("1.txt"), StandardCharsets.UTF_8);//поточный , но заврнутый в символьную обработку (в ковычки передаем поток new FileInputStream)/ можно еще и указать кодировку
            int x;//читать в цыкле каждый символ
            while ((x = inputStreamReader.read()) != -1) ;
            {//считывается новый символ и присваивается х... читать до - 1 означает коннец файла
                System.out.println(x);//выводим символ в консоль
                System.out.println((char) x);//преобразовываем в букву
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // пример чтения и записи через буфер целиком построчно

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"))) {
            System.out.println(bufferedReader.readLine()); //прочитать строчку и вывести

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String temp;

            while ((temp = bufferedReader.readLine()) != null) {//в цикле ваилд считать посторочно и парсить
                String[] studentParamsArray = temp.split(" ");  // поделить строку на пробелы как в файле
                students.add(new Student(studentParamsArray[0],
                        studentParamsArray[1], Integer.parseInt(studentParamsArray[2]))); //создаем новые обьекты и передаем в них
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(students);

//запишим в файл

        try (PrintWriter printWriter = new PrintWriter("new_students.csv")) {
            for (Student student : students) {//возмем файл студентс
                printWriter.println(student);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }



}