package homeWork_2;

import java.awt.dnd.DragSourceDragEvent;
import java.util.Random;

public class Сircle extends Figure{
    int radius;

    public Сircle (int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Площадь круга = " + Math.PI * radius * radius);
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр круга = " + Math.PI * 2 * radius);
    }
}
