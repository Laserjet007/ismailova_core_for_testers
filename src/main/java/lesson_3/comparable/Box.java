package lesson_3.comparable;

public class Box implements Comparable {
    private int size;

    public Box(int size) {
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
        return "box{" +
                "size=" + size +
                '}';
    }

   // public static void main(String[] args) {
    //    Box box1 = new Box(50);
     //   Box box2 = new Box(10);

     //   System.out.println(box1.compareTo(box2));

    //    Box[] boxes ={new Box(4), new Box(10), new Box(2), new Box(1)}; // отсортировать коробки

      //  Arrays.sort(boxes);
     //   System.out.println(Arrays.toString(boxes));

   // }


    @Override
    public int compareTo(Object o) {    //сравнить размер коробок
        return ((Box) o).getSize() - getSize();
        }
    }