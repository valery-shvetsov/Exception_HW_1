package semex1;
import java.util.ArrayList;
import java.util.List;
public class hw1_3 {
    

    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    //и возвращающий новый массив, каждый элемент которого равен разности элементов двух 
    //входящих массивов в той же ячейке. 
    //Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static void main(String[] args) {
        int[] my_list1 = new int[]{3,3,10,7,14,19};
        int[] my_list2 = new int[]{0,2,4,6,8,10};
        subtractionArray(my_list1, my_list2);
        subtractionArray1(my_list1, my_list2);
        List<Integer> subArray = new ArrayList<>();
        subArray=subtractionArray1(my_list1, my_list2);
        System.out.println(subArray);
    }
    private static void subtractionArray(int[] array1, int[] array2) {
        List<Integer> subArray = new ArrayList<>();
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы по длине разные: " + array1.length+" и "+array2.length+ " элементов");
        }
        for (int i = 0; i < array1.length; i++) {
            int sub=0;
            sub=array1[i]-array2[i];
            subArray.add(sub);
        }
        System.out.println(subArray);
    }
    private static List<Integer> subtractionArray1(int[] array1, int[] array2) {
        List<Integer> subArray = new ArrayList<>();
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы по длине разные: " + array1.length+" и "+array2.length+ " элементов");
        }
        for (int i = 0; i < array1.length; i++) {
            int sub=0;
            sub=array1[i]-array2[i];
            //subArray[i]=sub;
            subArray.add(sub);
        }
    return subArray;
    }
}