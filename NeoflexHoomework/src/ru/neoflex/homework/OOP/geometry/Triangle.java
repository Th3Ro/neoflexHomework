package NeoflexHoomework.src.ru.neoflex.homework.OOP.geometry;

public class Triangle implements Figure{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        sideA = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        sideB = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)), 0.5);
        sideC = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), 0.5);
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public double getLineLength() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getLineLength() / 2;
        return Math.pow((p * (p - sideA) * (p - sideB) * (p - sideC)), 0.5);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
