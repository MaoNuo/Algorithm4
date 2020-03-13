package chapter1.section1;

import java.util.Arrays;

public class exercise23 {
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length -1);
    }
    public static int rank(int key,int[] a,int lo,int hi){
        if( lo > hi) return -1;
        int mid = lo + (hi - lo) /2;
        if( key < a[mid]) return rank(key,a,lo,mid - 1);
        else if( key > a[mid]) return rank(key,a,mid + 1,hi);
        else return mid;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] numbers = {1, 4 , 5, 9, 10};

        Arrays.sort(arr);

        binarySearch(arr, numbers, '+');

        System.out.println();
        binarySearch(arr, numbers, '-');

        System.out.println("\n\nExpected:");
        System.out.println("Numbers NOT in whitelist:\n" +
                "9, 10\n" +
                "Numbers IN whitelist:\n" +
                "1, 4, 5");
    }

    private static void binarySearch(int[] arr, int[] numbers, char c) {
        if( c == '+'){
            System.out.println("Numbers NOT in whitelist:");
        } else {
            System.out.println("Numbers IN whitelist:");
        }

        int numbersCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int index = rank(numbers[i],arr);

            if( c == '+' && index == -1){
                if (numbersCount != 0){
                    System.out.print(", ");
                }

                System.out.print(numbers[i]);
                numbersCount++;
            }
            else if ( c == '-' && index != -1){
                if (numbersCount != 0){
                    System.out.print(", ");
                }

                System.out.print(numbers[i]);
                numbersCount++;
            }
        }
    }
}
