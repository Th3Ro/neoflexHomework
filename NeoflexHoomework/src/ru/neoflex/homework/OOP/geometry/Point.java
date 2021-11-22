package NeoflexHoomework.src.ru.neoflex.homework.OOP.geometry;

public class Point implements Figure{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String getType() {
        return "Point";
    }

    @Override
    public double getLineLength() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
