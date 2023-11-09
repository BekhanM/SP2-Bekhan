public class GasolineCar extends AFuelCar {
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public double getRegistrationFee() {
        double registrationFee = 0;

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            registrationFee += 330;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee += 1050;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee += 2340;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            registrationFee += 5500;
        } else if (getKmPrLitre() >= 0 && getKmPrLitre() < 5) {
            registrationFee += 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "FuelType: " + getFuelType() + "\nRegistrationFee: " + getRegistrationFee() + " DKK\n";
    }
}
