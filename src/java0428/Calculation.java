package java0428;

public class Calculation {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int result1 = add(5, 3);
        int result2 = add(5, 3, 2);

        System.out.println("2つの整数の和: " + result1);
        System.out.println("3つの整数の和: " + result2);
    }
}
