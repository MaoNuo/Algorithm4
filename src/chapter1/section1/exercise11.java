package chapter1.section1;

public class exercise11 {
    public static void main(String[] args){
        boolean[][] arr = {{true,false,true},{false,true,false}};
        printArray(arr);
    }

    private static void printArray(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if( arr[i][j] ){
                    System.out.print('*');
                }else {
                    System.out.print(' ');
                }
            }
        }
    }
}
