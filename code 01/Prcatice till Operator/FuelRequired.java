//Q20: A driver calculates fuel needed and adds extra reserve fuel. Find total fuel required.

class FuelRequired {
    public static void main(String[] args){
        double distance=100.0;
        double mileage=20.0;
        double extraLitres=2;
        double fuelRequired=distance/mileage;
        double totalFuelRequired=fuelRequired+extraLitres;
        System.out.println("Total Fuel required :"+totalFuelRequired);
    }
}