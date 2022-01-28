package lesson_4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(100);
        integerArrayList.add(123);
        integerArrayList.add(456);
        integerArrayList.add(789);
        integerArrayList.add(123);

        System.out.println(integerArrayList);

        integerArrayList.remove(Integer.valueOf(123));   //удалить первый найденный 123 элимент из массива ( коллкции)
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());

        integerArrayList.set(1, 999);     //set - подменяет ячейку
        System.out.println(integerArrayList);

        integerArrayList.add(1, 888);     //add удаляет элементы
        System.out.println(integerArrayList);

        integerArrayList.get(1); //взять элемент из определенного места

        System.out.println(integerArrayList.contains(new Integer(888)));  //поиск по элемент//
        System.out.println(integerArrayList.indexOf(new Integer(888)));   // найти элемент по индексу

        ArrayList<Integer> integerArrayList1 = new ArrayList<>(Arrays.asList(123, 456));//удалять пачками элементы под списками
        integerArrayList.removeAll(integerArrayList1);

        System.out.println(integerArrayList);

        integerArrayList.addAll(integerArrayList);//вставить пачками элементы
        System.out.println(integerArrayList);
    }


}
