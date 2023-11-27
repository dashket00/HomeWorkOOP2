package homeWork_2;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[] {
                new Triangle(3.0, 4.0, 5.0),
                new Rectangle(2, 6),
                new Сircle(4),
                new Triangle(5.0, 12.0, 13.0),
                new Rectangle(3, 8)
        };

        for (int i = 0; i < figures.length; i++) {
            figures[i].area();
            figures[i].perimetr();
        }

    }
}
