package lesson_2;

public class UncheckedExceptions {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
        } catch (Exception ex) {
            System.out.println("isklucheniya!");
        }
        if(b != 0)//проверка деления на 0
        {
            c = a / b;
            System.out.println("vycheslili c = " + c);
        }

        String[] strings = {"123sdgfs", "afa"};

        if (strings.length >=3) { String str = strings[2]; } //проверка длинны массива

    }

}
