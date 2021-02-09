import org.w3c.dom.css.Rect;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Rectangle> rectangles = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i < 15; i++){
            float length = random.nextInt(100);
            float width = random.nextInt(100);

            rectangles.add(new Rectangle(length, width));
        }
        System.out.println(rectangles);
        //zad a
        List<Rectangle> zad_a = rectangles.stream()
                .filter(rect -> rect.getArea() > rect.getPerimeter())
                .collect(Collectors.toList());
        System.out.println("\nZAD A)");
        System.out.println(zad_a);

        //zad b
        List<Rectangle> zad_b = rectangles.stream()
                .sorted(Comparator.comparingDouble(Rectangle::getPerimeter))
                .collect(Collectors.toList());
        System.out.println("\nZAD B)");
        System.out.println(zad_b);

        //zad c
        Double zad_c = rectangles.stream()
                .mapToDouble(Rectangle::getPerimeter)
                .average()
                .getAsDouble();

        System.out.println("\nZAD C)");
        System.out.println(zad_c);

        //zad d
        Double avg_area = rectangles.stream()
                .mapToDouble(Rectangle::getArea)
                .average()
                .getAsDouble();

        List<Rectangle> zad_d = rectangles.stream()
                .filter(rect -> rect.getArea() < avg_area)
                .sorted(Comparator.comparing(Rectangle::getArea).reversed())
                .collect(Collectors.toList());

        System.out.println("\nZAD D)");
        System.out.println(zad_d);

        //zad e
        Double zad_e = rectangles.stream()
                .mapToDouble(Rectangle::getArea)
                .sum();

        System.out.println("\nZAD E)");
        System.out.println(zad_e);

        //MAPA
        System.out.println("\nMAPA");
        Map<Rectangle,Double> mapa = rectangles.stream()
                .collect(Collectors.toMap( rect -> rect, Rectangle::getArea));

        System.out.println(mapa);

    }
}
