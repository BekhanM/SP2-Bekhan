public class ElectricCar extends ACar {

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    //batterycapacity(KWh) gange 1000 for at få Wh og dividere med maxrange for at få Wh/Km puha
    public int getWhPrKm() {
        int WhPrKm = (batteryCapacity * 1000) / maxRange;
        return WhPrKm;
    }

    public double getRegistrationFee() {
        double kmL = 100 / (getWhPrKm() / 91.25);
        double registrationFee = 0;

        if (kmL >= 20 && kmL <= 50) {
            registrationFee += 330;
        } else if (kmL >= 15 && kmL < 20) {
            registrationFee += 1050;
        } else if (kmL >= 10 && kmL < 15) {
            registrationFee += 2340;
        } else if (kmL >= 5 && kmL < 10) {
            registrationFee += 5500;
        } else if (kmL >= 0 && kmL < 5) {
            registrationFee += 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "Gross battery capacity: " + getBatteryCapacityKWh() + " kWh\nElectric range: " + getMaxRangeKm() + " km\nRated consumption: " + getWhPrKm() + " Wh/km\nRegistrationFee:  " + getRegistrationFee() + " DKK\n";
    }
}
