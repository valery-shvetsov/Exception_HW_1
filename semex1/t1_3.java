package semex1;

import java.util.List;

public class t1_3 {
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    //Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
    //метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
    // и в каждой ячейке может лежать только значение 0 или 1.
    // Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
    public static void main(String[] args) {

        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };
        
        System.out.println(getCount(ints));
    }
    private static int getCount(int[][] array) {
        if (isNotArgsCorrect(array)) {
            throw new RuntimeException("в массиве должны быть только 0 или 1");
        }
        if (isNotSquareArr(array)) {
            throw new RuntimeException("массив не квадратный");
        }
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                summ += array[i][j];
            }
        }
        return summ;
    }

    private static boolean isNotSquareArr(int[][] array) {
        for (int[] elem : array) {
            if (elem.length != array.length) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNotArgsCorrect(int[][] array) {
        List<Integer> container = List.of(0, 1);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (!container.contains(array[i][j])) {
                    return true;
                }
            }
        }
        return false;   
    
    }
}