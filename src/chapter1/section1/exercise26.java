package chapter1.section1;

public class exercise26 {
    public static void sort(int a,int b,int c){
        System.out.println("a :" + a + " - b:" + b + " - c:" + c);
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("a :" + a + " - b:" + b + " - c:" + c);
    }

    public static void main(String[] args){
        int a = 5,b = 3, c = 10;
        sort(a,b,c);
    }
}
