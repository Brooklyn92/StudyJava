package udemy_advanced_java.collection.binary_search;

import java.util.Arrays;

public class BinarySearchExample3 {
    public static void main(String[] args) {
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};

        System.out.println(Arrays.toString(array)); // => [-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19]

        Arrays.sort(array); // => сортируем массив array по возрастанию

        System.out.println(Arrays.toString(array)); // =>  [-30, -8, -3, 0, 1, 5, 8, 10, 12, 19, 150]

        int index = Arrays.binarySearch(array, 150);
        System.out.println(index); // => 10

    }
}
