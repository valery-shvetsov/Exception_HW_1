package semex1;
import java.util.ArrayList;
import java.util.List;

public class t1_4 {

//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
//1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

    public static void main(String[] args) {
        Integer[] newArray = new Integer[]{2,4,6,null,8,9, null};
        checkArray(newArray);
    }       
    private static void checkArray(Integer[] array) {
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                index.add(i);
            }
        }
        if (index.size() != 0) {
            throw new RuntimeException("В массиве присутсвуют null  в индексах: " + index);
        }
        System.out.println("Массив не содержит null");
    }
}  


