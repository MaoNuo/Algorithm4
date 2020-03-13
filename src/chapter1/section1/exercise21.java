package chapter1.section1;

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args){
        System.out.printf("%8s %7s %7s %7s", "Names", "Number1", "Number2", "Result\n");
        Scanner scanner = new Scanner(System.in);

        while( scanner.hasNextLine() ){
            String line = scanner.nextLine();
            String[] values = line.split(" ");
            formattedPrint(values);
        }
    }

    public static void formattedPrint(String[] values){
        System.out.printf("%8s", values[0]);
        System.out.printf("%8s", values[1]);
        System.out.printf("%8s", values[2]);

        double value1 = Double.parseDouble(values[1]);
        double value2 = Double.parseDouble(values[2]);
        System.out.printf("%7.3f\n", value1/value2);
    }
}
