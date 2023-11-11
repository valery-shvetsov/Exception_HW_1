package semex1;

public class hw1_1 {
    

    //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void main(String[] args) {
        //int[] my_list = new int[]{1, 4, 8, 99, 7, 6,1,1,1,1,1};
        int[] my_list = new int[]{1, 4,2,11 };
        int value=10;
        System.out.println(sumArray(my_list, value));
    }
    private static int sumArray(int[] array, int value) {
        if (maxsizeArray(array)) {
            throw new RuntimeException("массив не должен быть более 10 элементов");
        }

        if (minsizeArray(array)) {
            throw new RuntimeException("массив не должен быть менее 3 элементов");
        }

        if (elementValue(array, value)) {
            throw new RuntimeException("в массиве не должно быть быть элементов со значением более заданного лимита");
        }

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];

        }
        return sum;
    }

    private static boolean maxsizeArray(int[] array) {
        //массив не должен быть более 10 элементов
            if (array.length>10) {
                return true;
        }
        return false;
    }  
    
        private static boolean minsizeArray(int[] array) {
        //массив не должен быть менее 3 элементов
            if (array.length<3) {
                return true;
        }
        return false;
    } 
    
    private static boolean elementValue (int[] array, int limit) {
        //в массиве не должно быть быть элементов со значением более заданного лимита
            for (int i = 0; i < array.length; i++) {
                if (array[i]>limit) {
                return true;
                }
            }
        return false;
    }   
}
