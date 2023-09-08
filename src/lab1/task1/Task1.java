package lab1.task1;

public class Task1 {

    public static void main(String[] args) {
        Task1 t = new Task1();
        System.out.println(t.formula(-3,4));
    }

    double formula(int x, int y){
        double sin = Math.sin(x + y);
        double upper = 1 + sin * sin;
        double down = 2 + Math.abs(x - (2.0d * x) / (1 + x * x * y * y) );
        return upper / down + x;
    }
}
