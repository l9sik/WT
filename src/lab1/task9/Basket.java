package lab1.task9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {

    private List<Ball> balls;
    private boolean isSorted;

    public Basket() {
        this.balls = new ArrayList<>();
        isSorted = true;
    }

    public int getWeight(){
        int weight = 0;
        for(Ball b : balls){
            weight += b.getWeight();
        }
        return weight;
    }

    void sortBalls(){
        balls.sort(Comparator.comparingInt(a -> a.getColor().ordinal()));
        isSorted = true;
    }

    void addBall(Ball ball){
        balls.add(ball);
        isSorted = false;
    }

    public int getBallsCount(Color color){
        return getBallByColor(color).size();
    }

    public List<Ball> getBallByColor(Color color) {
        List<Ball> coloredBalls = new ArrayList<>();
        if (!isSorted){
            sortBalls();
        }

        int firstOccurence = findFirstOccurrence(balls, color);

        if(firstOccurence != -1){
            Ball current = balls.get(firstOccurence);
            int i = firstOccurence;
            do{
                coloredBalls.add(current);
                if(++i == balls.size()) break;
                current = balls.get(i);
            }while(current.getColor().equals(color));
        }
        return coloredBalls;
    }

    private int findFirstOccurrence(List<Ball> list, Color target) {
        int left = 0;
        int right = list.size() - 1;
        int result = -1;  // Initialize result to null, indicating not found.

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Ball midElement = list.get(mid);

            int comparison = Integer.compare(midElement.getColor().ordinal(), target.ordinal());

            if (comparison == 0) {
                // If the current element is equal to the target, update the result
                result = mid;
                // Move left to find any earlier occurrences
                right = mid - 1;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
