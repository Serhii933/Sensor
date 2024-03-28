package app;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Processor processor = new Processor();
        sensor.addObserver(processor);

        sensor.setTemperature(0);
        sensor.setWeight(1);
        sensor.setColor("White");

        sensor.setTemperature(5);
        sensor.setWeight(11);
        sensor.setColor("Black");
    }
}

