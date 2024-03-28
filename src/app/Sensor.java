package app;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private int weight;
    private String color;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setWeight(int weight) {
        this.weight = weight;
        notifyObservers();
    }

    public void setColor(String color) {
        this.color = color;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, weight, color);
        }
    }
}

