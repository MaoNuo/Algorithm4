package chapter1.section1;

public class exercise5 {
    public static boolean belong0_1(double x,double y){
        if( x >= 0 && x <= 1 && y >= 0 && y <= 1 ){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println(belong0_1(x,y));
    }
}
