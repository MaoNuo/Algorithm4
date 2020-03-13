package chapter1.section1;

public class exercise14 {
    public static int lg(int N){
        int result = 0;
        while( N > 0){
            N /= 2;
            result++;
        }
        return result - 1;
    }

    public static void main(String[] args){
        System.out.println(lg(4));
        System.out.println(lg(1));
    }
}
