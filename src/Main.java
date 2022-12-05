import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a = getTriangleSide("a");
        float b = getTriangleSide("b");
        float c = getTriangleSide("c");

        float p = getTriangleP(a, b, c);

        float heightA = getTriangleHeight(a, p);
        float heightB = getTriangleHeight(b, p);
        float heightC = getTriangleHeight(c, p);

        printResult("a", heightA);
        printResult("b", heightB);
        printResult("c", heightC);
    }

    private static float getTriangleSide(String sideName) {
        System.out.printf("Введите сторону %s треугольника: ", sideName);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static float getTriangleP(float a, float b, float c) {
        float p = (a + b + c) / 2;
        return p * (p - a) * (p - b) * (p - c);
    }

    private static float getTriangleHeight(float x, float p) {
        return 2 / x * (float)Math.sqrt(p);
    }

    private static void printResult(String sideName, float height) {
        System.out.printf("Высота к стороне %s треугольника: %.3f\n", sideName, height);
    }
}