package lab1.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    Basket basket;
    int blueCount;
    int totalWeight;

    @BeforeEach
    void initBasket(){
        blueCount = 0;
        totalWeight = 0;
        basket = new Basket();
        Random r = new Random();
        int size = r.nextInt(1, 100);
        for (int i = 0; i < size; i++){
            Ball ball = randomBall(r);
            if (ball.color().equals(Color.BLUE)){
                blueCount++;
            }
            totalWeight += ball.weight();
            basket.addBall(ball);
        }
    }

    Ball randomBall(Random r){
        Color color = Color.values()[r.nextInt(0, Color.values().length)];
        int weight = r.nextInt(1, 100);
        return new Ball(color, weight);
    }

    @Test
    void testBlueCount() {
        int actualBlueCount = basket.getBallsCount(Color.BLUE);
        assertEquals(blueCount, actualBlueCount);
    }

    @Test
    void testWeight(){
        int actualWeight = basket.getWeight();
        assertEquals(totalWeight, actualWeight);
    }
}