package pl.winiarczyk.lesson4.homework.RightTriangle;

public class Triangle {

    private static int sideA;
    private static int sideB;
    private static int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static boolean isRightTriangle() {
        return (sideA * sideA) + (sideB * sideB) == (sideC * sideC);
    }
}
