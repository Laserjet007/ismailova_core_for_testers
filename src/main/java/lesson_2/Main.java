package lesson_2;

public class Main {
    public static void main(String[] args) {
        //int a = 1 / 0;
        test();
        test1();
        test2();
        System.out.println("method main");
    }

    public static void test() {
        //test();
        test1();
        System.out.println("method test");
    }

    public static void test1() {
        test2();
        System.out.println("method test1");
    }
    public static void test2() {
       // int a = 1 / 0;

        /*StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.println(stackTraceElement.getMethodName() + " " + stackTraceElement.getLineNumber());
        }*/

        System.out.println("method test2");
    }

}
