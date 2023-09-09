package lab1.task9;
public class Ball {

    private int weight;
    private Color color;


    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }
}
