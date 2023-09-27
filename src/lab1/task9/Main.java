package lab1.task9;

import java.util.Random;

public class Main {

    static Basket basket;
    public static void main(String[] args) {
        basket = new Basket();
        Random r = new Random();
        int size = r.nextInt(1, 100);
        for (int i = 0; i < size; i++){
            Ball ball = randomBall(r);
            basket.addBall(ball);
        }
        System.out.println(basket.getBallByColor(Color.BLUE));
    }

    static Ball randomBall(Random r){
        Color color = Color.values()[r.nextInt(0, Color.values().length)];
        int weight = r.nextInt(1, 100);
        return new Ball(color, weight);
    }
}
