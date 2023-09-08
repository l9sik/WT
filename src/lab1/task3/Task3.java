package lab1.task3;

import lab1.task2.Point;

import java.util.ArrayList;
import java.util.List;

public class Task3 {


    public static void main(String[] args) {
        Task3 t = new Task3();
        outPoints(t.tg(0, 10, 1));

    }
    public List<Point> tg(double a, double b, double step){
        if (step == 0.0){
            return null;
        }

        List<Point> points = new ArrayList<>( (int)(Math.abs(a-b) / step));

        for (double x = a; x < b; x += step){
            points.add(new Point(x, Math.tan(x)));
        }

        return points;
    }

    static void outPoints(List<Point> points){
        for(int i = 0; i < points.size(); i++){
            System.out.printf("%7d ", i);
        }
        System.out.println();
        for (Point p : points){
            System.out.printf("%+.4f ", p.getX());
        }
        System.out.println();
        for (Point p : points){
            System.out.printf("%+.4f ", p.getY());
        }
    }

}
