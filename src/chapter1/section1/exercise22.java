package chapter1.section1;

import java.util.Arrays;

public class exercise22 {
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length -1,0);
    }
    public static int rank(int key,int[] a,int lo,int hi,int depth){
        if( depth != 0){
            System.out.println();
        }

        for( int i = 0 ; i < depth ; i++ ){
            System.out.print(" ");
        }
        System.out.print("lo: " + lo + " - hi :" + hi);

        if( lo > hi) return -1;
        int mid = lo + (hi - lo) /2;
        if( key < a[mid]) return rank(key,a,lo,mid - 1,++depth);
        else if( key > a[mid]) return rank(key,a,mid + 1,hi,++depth);
        else return mid;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int key = 2;

        Arrays.sort(arr);

        int index = rank(key, arr, 0, arr.length-1, 0);

        System.out.println();
        System.out.println("Index: " + index);

        System.out.println("\nExpected:");
        System.out.println("lo: 0 - hi: 6\n" +
                " lo: 0 - hi: 2\n" +
                "Index: 1");
    }
}
