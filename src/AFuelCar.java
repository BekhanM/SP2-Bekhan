public abstract class AFuelCar extends ACar {
    private double kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public double getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "FuelConsumption: " + getKmPrLitre() + " km/l\n";
    }
}