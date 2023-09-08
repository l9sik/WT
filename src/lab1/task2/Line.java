package lab1.task2;

import java.util.Comparator;

public class Line {

    Point firstPoint;
    Point secondPoint;

    double epsilon = 1e-6;

    double a;
    double b;

    Line(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        if (areEqual(firstPoint.x, secondPoint.x, epsilon)){
            a = 1.0d / epsilon;
        }else
            a = (secondPoint.y - firstPoint.y) / (secondPoint.x - firstPoint.x);
        b = firstPoint.y - a * firstPoint.x;
    }

    boolean isOnLine(Point point) {
        double AB = distance(firstPoint, secondPoint);
        double AC = distance(firstPoint, point);
        double CB = distance(point, secondPoint);
        return areEqual(AC + CB, AB, epsilon);
    }

    public static boolean areEqual(double a, double b, double epsilon) {
        // Check if the absolute difference between a and b is less than epsilon
        return Math.abs(a - b) < epsilon;
    }
    double distance(Point p1, Point p2){
        double xSum = p1.x - p2.x;
        double ySum = p1.y - p2.y;
        return  Math.sqrt(xSum * xSum + ySum * ySum);
    }

    public Point getCrossing(Line line){
        if (areEqual(this.a, line.a, epsilon)){
            return null;
        }

        double x = (line.b - this.b) / (this.a - line.a) ;
        double y = line.a * x + line.b;
        return new Point(x, y);
    }
}
