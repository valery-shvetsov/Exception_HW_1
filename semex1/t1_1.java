package semex1;
public class t1_1 {
    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    //Если длина массива меньше некоторого заданного минимума,
    // метод возвращает -1, в качестве кода ошибки, иначе - длину массива
    
    public static void main(String[] args) {
        int[] my_list = new int[]{1, 4, 8, 99, 7, 6};
        System.out.println(getLengh(my_list, 6));
    }
    private static int getLengh(int[] array, int limit) {
        if (array.length < limit) {
            return -1;
        } else {
            return array.length;
        }
    }
}