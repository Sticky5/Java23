package pl.winiarczyk.lesson4.homework.RightTriangle;

public class RightTriangle {

    int sideA;
    int sideB;
    int sideC;

    public RightTriangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static boolean isRightTriangle(int sideA, int sideB, int sideC) {
        return (sideA ^ 2) + (sideB ^ 2) == (sideC ^ 2);
    }
}
