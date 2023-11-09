public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar rangeRover = new GasolineCar("AL 68 923", "Range Rover", "Evoque", 4, 10.8);
        //System.out.println(rangeRover.toString());

        DieselCar volkswagen = new DieselCar("CV 81 319", "Volkswagen", "Passat", 4, 24.4, true);
        //System.out.println(volkswagen.toString());

        ElectricCar porsche = new ElectricCar("RX 20 ZBD", "Porsche", "Taycan", 4, 93, 505);
        //System.out.println(porsche.toString());

        fleet.addCar(rangeRover);
        fleet.addCar(volkswagen);
        fleet.addCar(porsche);


        System.out.println(fleet.toString());
        System.out.println(fleet.getTotalRegistrationFeeForFleet());
    }
}