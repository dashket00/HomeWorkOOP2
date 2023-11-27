package homeWork_2;

public class Rectangle extends Figure{
    int length;
    int height;

    public Rectangle (int length, int height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public void area() {
        System.out.println("Площадь прямоугольника = " + length * height);
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр прямоугольника = " + (length + height)*2);
    }
}
