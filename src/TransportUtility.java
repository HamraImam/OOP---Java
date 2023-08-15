import java.util.ArrayList;
import java.util.List;

public class TransportUtility {
    public void demoPolymorphism() {
        List<Transport> vehiclesList =  new ArrayList<>();

        Transport car = new Car(100, 15);
        Transport bus = new Bus(60, 5);
        Transport bicycle =  new Bicycle(20);

        vehiclesList.add(car);
        vehiclesList.add(bus);
        vehiclesList.add(bicycle);

        for (Transport transport: vehiclesList){
            System.out.println("Speed is "+ transport.getSpeed());
            System.out.println("Efficiency is "+ transport.calculateFuelEfficiency());
            System.out.println("Type is "+ transport.getTransportType());
            System.out.println("--------------------");

        }
    }

    public double calculateTravelTime(Transport transport, double distance) {
        return distance/ transport.getSpeed();
    }


    public static void main(String[] args) {
        Transport car = new Car();
        Transport bus = new Bus();
        Transport bicyle = new Bicycle()l

    }
}
