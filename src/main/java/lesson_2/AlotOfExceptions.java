package lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class AlotOfExceptions {

    public static void main(String[] args) {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("test.txt");
            //test();
            String[] strings = {"123sdgfs", "afa"};
            String str = strings[2];
            int a = 1 / 0;
        }
        catch (FileNotFoundException ex) {} //предпочтительнее так обрабатывать ошибки
        catch (Exception ex) {         //ловит все ошибки но лучше обрабатывать по определенному типу
        }

        // catch (FileNotFoundException | ArithmeticException ex)  {    //захват ошибок
           // ex.printStackTrace();//выполнение стек трейса
           // catch (StackOverflowError err) {
//
          //  }
            finally {
                System.out.println("I vork!!!");
            }
        } ;

        //System.out.println("I live!");
    }

      //  public static void test () {
       //     test();
       // }
    //}

