package lesson_5;

import java.io.File;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {
        File file = new File("1.txt");//проверить есть ли с таким именем

        System.out.println(file.exists());

        file.createNewFile();//создать файл который запрашивали на проверку сперед этим

        System.out.println(file.length());//проверить количество символов в файле

        //file.delete();//удалить файл
        //file.deleteOnExit();  удалить файл по завершении приложения

        File filePath = new File("1");//создать папку 1
        filePath.mkdir();

        File filePath1 = new File("2/1/3/5");//создать папки  2 1 3 5 в иерархии от 2 и далее каждая папка вложена в предидущую
        filePath1.mkdirs();

        System.out.println(filePath1.length());//вывести в консоль путь папок

        for(File fileTemp : filePath1.listFiles()) {//пройтись по иерархии папок и проверить что в них (названия , типы, просто распечатать)
            System.out.println(fileTemp.getName());}
    }
}
