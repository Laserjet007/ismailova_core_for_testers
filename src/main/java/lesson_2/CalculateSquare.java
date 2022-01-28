package lesson_2;

public class CalculateSquare {
    public static void main(String[] args) {
        int sqvare = calcRectangleSqvare(-1, 9);

         System.out.println(sqvare);
    }

    private static int calcRectangleSqvare(int sideA, int sideB) throws OneOrBothRectangleSideIsNegativeException {
        if(sideA <= 0 || sideB <= 0) {//что бы пользователь не смог прописать какую нибудь хуйню надо использовать иф
           // System.out.println("Стороны прямоугольника должны быть >= 0"); - можно вывести пользователю сообщение
        //return -1; лучше вывести исключения что бы на бекэнд не прикручивать сообщение об ошибки

            throw new OneOrBothRectangleSideIsNegativeException();
        }

        return  sideA * sideB;
    }
}

