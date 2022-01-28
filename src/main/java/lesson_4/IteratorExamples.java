package lesson_4;

import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        for (Integer i = 0; i < integerArrayList.size(); i++) {
            if (i == 3) {
                integerArrayList.remove(i);//удаляем элемент 3
            }
        }

        System.out.println(integerArrayList);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("test1", 4);
        hashMap.put("test12", 4);
        hashMap.put("test13", 4);
        hashMap.put("test134", 5);
        System.out.println(hashMap);

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            String data = iterator.next().getKey();
            System.out.println(data);


            if (data.equals("test12")) {
                iterator.remove();
            }
        }
    }
}