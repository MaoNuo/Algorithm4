package chapter1.section1;

public class exercise24 {
    public static int Euclid(int p,int q){
        if ( q == 0) return p;
        System.out.println("p :" + p + " - q :" + q);
        return Euclid( q, p % q);
    }
    public static void main(String[] args){
        System.out.println(Euclid(105,24));

        //arg1 == 90, arg2 == 20
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        System.out.println(Euclid(arg1,arg2));

        System.out.println(Euclid(1111111, 1234567));
    }
}
