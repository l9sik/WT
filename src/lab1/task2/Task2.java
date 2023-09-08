package lab1.task2;

public class Task2 {

    public static void main(String[] args) throws Exception {
        Area shape = new Area(-4, 5, 4, 5, 4, 0, 6, 0, 6, -3, -6, -3, -6, 0, -4, 0);
        System.out.println(shape.isPointInArea(new Point(0, 0)));
    }
}
