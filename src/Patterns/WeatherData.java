package Patterns;

import java.util.ArrayList;

public class WeatherData implements ISubject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = observers;
    }
    @Override

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    @Override

    public void removeObserver(IObserver observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }
    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++) {
            IObserver observer = (IObserver) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
