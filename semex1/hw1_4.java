package semex1;

import java.util.ArrayList;
import java.util.List;

public class hw1_4 {
    //* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    //и возвращающий новый массив, каждый элемент которого равен частному элементов 
    //двух входящих массивов в той же ячейке. 
    //Если длины массивов не равны, необходимо как-то оповестить пользователя. 
    //Важно: При выполнении метода единственное исключение, 
    //которое пользователь может увидеть - RuntimeException, т.е. ваше.
    public static void main(String[] args) {
        int[] my_list1 = new int[]{2,4,6,8,10,12};
        int[] my_list2 = new int[]{2,2,2,2,2,0};
        dividingArray(my_list1, my_list2);
        List<Integer> divArray = new ArrayList<>();
        divArray=dividingArray(my_list1, my_list2);
        System.out.println(divArray);
    }
    private static List<Integer> dividingArray(int[] array1, int[] array2) {
        List<Integer> resultArray = new ArrayList<>();
        List<Integer> index0 = new ArrayList<>();
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы по длине разные: " + array1.length+" и "+array2.length+ " элементов");
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i]==0){
                index0.add(i);
            }
            if (index0.size() != 0) {    
                throw new RuntimeException("В маассиве делителя есть элементы = 0 " +index0);
            }
        }   
        for (int i = 0; i < array1.length; i++) {
            resultArray.add(array1[i]/array2[i]);
        }
    return resultArray;
    }    
}
