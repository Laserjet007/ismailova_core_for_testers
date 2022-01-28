package lesson_4;

import java.util.Comparator;

public class CatComparatorByWeight implements Comparator<Cat> { //дополнительный маячок для сравнения по разному(по чему угодно) (по словам педагога)
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
