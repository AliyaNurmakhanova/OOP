package Patterns;

public class StatisticDisplay implements IObserver, DisplayElement{
    private float temperature;
    private float humidity;
    private ISubject weatherData;

    public StatisticDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "
                + temperature + " F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
