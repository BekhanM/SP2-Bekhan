public class DieselCar extends AFuelCar {

    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Vin Diesel";
    }

    @Override
    public double getRegistrationFee() {
        double registrationFee = 0;

        if (hasParticleFilter() == false) {
            registrationFee += 1000;
        }

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            registrationFee += (330 + 130);
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee += (1050 + 1390);
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee += (2340 + 1850);
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            registrationFee += (5500 + 2770);
        } else if (getKmPrLitre() >= 0 && getKmPrLitre() < 5) {
            registrationFee += (10470 + 15260);
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "FuelType: " + getFuelType() + "\nRegistrationFee: " + getRegistrationFee() + " DKK\nParticleFilter: " + hasParticleFilter() + "\n";
    }
}
