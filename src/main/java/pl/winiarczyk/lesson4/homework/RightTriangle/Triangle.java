package pl.winiarczyk.lesson4.homework.RightTriangle;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean isRightTriangle() {
        return (sideA * sideA) + (sideB * sideB) == (sideC * sideC);
    }
}
