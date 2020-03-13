package chapter1.section1;

public class exercise19 {
    public static int F(int N){
        if(N==0) return 0;
        if(N==1) return 1;
        return F(N-1) + F(N-2);
    }

    public static long enhancedF(int N,long[] arr){
        if(N==0){
            arr[N] = 0;
            return arr[N];
        }
        if(N==1){
            arr[N] = 1;
            return arr[N];
        }
        arr[N] = arr[N-1] + arr[N-2];
        return arr[N];
    }

    public static void main(String[] args){
//        for (int N = 0; N < 100; N++) {
//            System.out.println(N + " " + F(N));
//        }
        long[] arr = new long[100];
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + enhancedF(N,arr));
        }
    }
}
