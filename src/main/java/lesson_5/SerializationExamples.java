package lesson_5;

//вариант передачи обьекта ссылочного типа ( не строка или буквы ) или вариант передачи обьекта джавы что бы он лежал на выходе для работы с ним

import java.io.*;

public class SerializationExamples {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("student");//открываем файт в который будем сериализовывать

        Student student = new Student("Anton", "Gangonov", 45);
        Student student1 = new Student("Ivan", "Heronov", 76);
        Student student2 = new Student("Semen", "Rudicov", 98);
        Student student3 = new Student("Drtg", "Dthhyjj", 45);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {; //записываем обьекты-студенты в файл (можно также по сети передать
            objectOutputStream.writeObject(student);//вызываем целиком обьект
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.writeObject(student3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    //вариант чтения переданного до этого обьекта, так как нужно в данный момент

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream((file)))) {
             Student studentFromFile1 = (Student) objectInputStream.readObject();//читаем файл  (Student)- приводим к обекту увевщись что он обжект
             System.out.println(studentFromFile1);
            Student studentFromFile2 = (Student) objectInputStream.readObject();//читаем файл  (Student)- приводим к обекту увевщись что он обжект
            System.out.println(studentFromFile2);
            Student studentFromFile3 = (Student) objectInputStream.readObject();//читаем файл  (Student)- приводим к обекту увевщись что он обжект
            System.out.println(studentFromFile3);
            Student studentFromFile4 = (Student) objectInputStream.readObject();//читаем файл  (Student)- приводим к обекту увевщись что он обжект
            System.out.println(studentFromFile4);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
