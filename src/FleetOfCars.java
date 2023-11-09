import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car) {
        fleet.add(car);
    }

    public String getTotalRegistrationFeeForFleet() {
        int totalFee = 0;

        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return "The total registration fee for the whole fleet is " + totalFee + ", bro";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Car car : fleet) {
            sb.append(car);
        }
        return sb.toString();
    }
}
