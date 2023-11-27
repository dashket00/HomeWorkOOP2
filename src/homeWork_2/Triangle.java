package homeWork_2;

public class Triangle extends Figure{
    Double a;
    Double b;
    Double c;
    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void area() {
        Double s = (a+b+c)/2;
        Double conc = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Площадь треугольника = " + conc);
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр треугольника" + a + b + c);
    }
}
