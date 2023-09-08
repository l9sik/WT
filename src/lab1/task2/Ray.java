package lab1.task2;

public class Ray extends Line{

    Ray(Point firstPoint, Point secondPoint) {
        super(firstPoint, secondPoint);
    }

    @Override
    boolean isOnLine(Point point) {
        Point vec1 = new Point(firstPoint.x - point.x, firstPoint.y - point.y);
        Point vec2 = new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y);

        double scolarMul = vec1.x * vec2.x + vec1.y * vec2.y;

        return scolarMul >= 0;
    }
}
