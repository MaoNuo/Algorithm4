package chapter1.section1;

public class exercise13 {
    public static void print(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] mat){
        int[][] newmat = new int[mat[0].length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                newmat[j][i] = mat[i][j];
            }
        }

        print(newmat);
    }

    public static void main(String[] args){
        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };
        transpose(mat);
    }
}
