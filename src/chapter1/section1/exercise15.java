package chapter1.section1;

public class exercise15 {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4};

        int[] newArrA = histogram(a, 5);

        int[] b = {1, 2, 3, 9};

        int[] newArrB = histogram(b, 7);

        for (int i = 0; i < newArrA.length; i++) {
            System.out.print(newArrA[i] + " ");
        }
        System.out.println("\nExpected: 0 1 1 1 1");

        System.out.println();

        for (int i = 0; i < newArrB.length; i++) {
            System.out.print(newArrB[i] + " ");
        }
        System.out.println("\nExpected: 0 1 1 1 0 0 0");
    }

    public static int[] histogram(int[] a,int M){
        int[] res = new int[M];
        for( int num : a ){
            if( num >= 0 && num < M ){
                res[num]++;
            }
        }
        return res;
    }
}
