import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a = getTriangleSide("a");
        float b = getTriangleSide("b");
        float c = getTriangleSide("c");

        float semiPerimeter = getTriangleSemiPerimeter(a, b, c);

        float heightA = getTriangleHeight(a, semiPerimeter);
        float heightB = getTriangleHeight(b, semiPerimeter);
        float heightC = getTriangleHeight(c, semiPerimeter);

        printResult("a", heightA);
        printResult("b", heightB);
        printResult("c", heightC);
    }

    private static float getTriangleSide(String sideName) {
        System.out.printf("Введите сторону %s треугольника", sideName);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static float getTriangleSemiPerimeter(float a, float b, float c) {
        return (a + b + c) / 2;
    }

    private static float getTriangleHeight(float x, float p) {
        return 2 / x * (float)Math.sqrt(p);
    }

    private static void printResult(String sideName, float height) {
        System.out.printf("Высота стороны %s треугольника: %.3f\n", sideName, height);
    }
}