import java.awt.*;

public class Bicycle implements Transport {

    private double speed;

    public Bicycle(double speed) {
        this.speed = speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public String getTransportType() {
        return "Car";
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0;
    }
}

//    public double getFuelEfficiency() {
//        return fuelEfficiency;
//    }

