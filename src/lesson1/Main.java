package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Integer[] arr = {1, 3, 5, 7, 9, 0, 8, 6, 4, 2};
        change(arr,0, 9);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        ArrayList<Integer> arrList = arrToList(arr);
        System.out.println(arrList);

    }

    public static <T> ArrayList<T> arrToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void change(Object[] arr, int i, int j) {
        Object firstElement = (int) arr[i];
        arr[i] = arr[j];
        arr[j] = firstElement;
    }


}
