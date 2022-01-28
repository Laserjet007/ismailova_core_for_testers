package lesson_3;

public class GenBox<T> {
    private T object;

    public GenBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        GenBox<Integer> integerGenBox1 = new GenBox(5);

        GenBox<Integer> integerGenBox2 = new GenBox<>(10);

        System.out.println(integerGenBox1.getObject().getClass().getAnnotations().hashCode());

        System.out.println(integerGenBox1.getObject() + integerGenBox2.getObject());

        GenBox<String> stringGenBox = new GenBox<>("Test");
        //stringGenBox.setObject("5");

        GenBox genBox = new GenBox(5);
        Integer a = new Integer(5);
        Number b = a;
        // List<Integer> integerArrayList = new ArrayList<>();
        //ArrayList<Number> numberArrayList = integerArrayList;
    }
}
