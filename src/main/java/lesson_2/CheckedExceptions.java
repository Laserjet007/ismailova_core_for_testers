package lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedExceptions {
    public static  void main(String[] args) throws FileNotFoundException {
    //try {
         // InputStream inputStream = new FileInputStream("test.txt");
          //} catch (FileNotFoundException e) {
             //.printStackTrace();обычно направляется в кеш
       InputStream inputStream = new FileInputStream("test.txt");
}
}