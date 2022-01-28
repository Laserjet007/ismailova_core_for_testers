package lesson_3.comparable;

import java.util.Arrays;

public class Box2  implements Comparable<Box2> {
    private int size;

    public Box2(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(Box2 o) {
        return size - o.getSize();
    }
    public static void main(String[] args) {
        Box box1 = new Box(50);
        Box box2 = new Box(10);

        System.out.println(box1.compareTo(box2));

        Box[] boxes ={new Box(4), new Box(10), new Box(2), new Box(1)}; // отсортировать коробки

        Arrays.sort(boxes);
        System.out.println(Arrays.toString(boxes));

    }
}
