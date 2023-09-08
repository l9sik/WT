package lab1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Area{
    List<Point> areaPoints;

    int lineIndex;

    Area(double... coordinates) throws Exception {
        if (coordinates.length % 2 != 0){
            throw new Exception("There should be odd numbers of coordinates");
        }
        areaPoints = new ArrayList<>();
        for (int i = 0; i < coordinates.length; i += 2){
            areaPoints.add(new Point(coordinates[i], coordinates[i+1]));
        }
        lineIndex = 0;
    }


    boolean isPointInArea(Point p){
        boolean hadParallel = true;
        int crossCount = 0;
        while (hadParallel){
            Line ray = randomRay(p);
            crossCount = 0;
            for (int i = 0; i < areaPoints.size(); i++){
                Line currentLine = getLine(i);
                Point crossing = currentLine.getCrossing(ray);
                if (crossing == null){
                    hadParallel = true;
                    break;
                }else{
                    hadParallel = false;
                }
                if (ray.isOnLine(crossing)) {
                    crossCount++;
                }
            }
        }
        return (crossCount % 2) != 0;
    }

    Line randomRay(Point p){
        Random r = new Random();
        return new Ray(p, new Point(11, 10));
        //return new Line(p, new Point(r.nextDouble() * 10, r.nextDouble() * 10));
    }

    Line getLine(int index){
        if (index == areaPoints.size() - 1){
            return new Line(areaPoints.get(index), areaPoints.get(0));
        }
        return new Line(areaPoints.get(index), areaPoints.get(index + 1));
    }


}
