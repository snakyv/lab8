public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Виклик нового методу для обчислення суми
        int result = sum(5, 10);
        System.out.println("Sum: " + result);

        int productResult = multiply(5, 10);
        System.out.println("Product: " + productResult);
    }

    // Метод для обчислення суми двох чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) { return a * b; }
}


