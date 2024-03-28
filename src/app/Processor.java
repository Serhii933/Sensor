package app;

public class Processor implements Observer {
    private int temperature;
    private int weight;
    private String color;

    @Override
    public void update(int temperature, int weight, String color) {
        this.temperature = temperature;
        this.weight = weight;
        this.color = color;
        System.out.println("Temperature: " + temperature + " Weight: " + weight + " Color: " + color);
    }
}

