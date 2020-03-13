package chapter1.section1;

public class exercise3 {
    public static boolean threeNums(int num1,int num2,int num3){
        if( num1 == num2){
            if( num1 == num3){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.println(threeNums(n1,n2,n3));
    }
}
