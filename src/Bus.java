import java.awt.*;

public class Bus implements Transport {

    private double speed;
    private double fuelEfficiency;

    public Bus(double speed, double fuelEfficiency) {
        this.speed = speed;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double getSpeed(){
        return speed;
    }

    @Override
    public String getTransportType(){
        return "Bus";
    }

    @Override
    public double calculateFuelEfficiency(){
        return fuelEfficiency;
    }

//    public double getFuelEfficiency() {
//        return fuelEfficiency;
//    }
}
