public class Fibo{
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, n = 15;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i < n; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}