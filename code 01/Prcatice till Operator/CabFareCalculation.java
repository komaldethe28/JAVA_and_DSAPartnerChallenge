//Q17: Cab charges base fare + per km charge. Find total fare.

class CabFareCalculation {
    public static void main(String[] args){
        double baseFare=50.0;
        double chargePerKm=10.0;
        double distance=20;
        double totalFare= baseFare + (distance*chargePerKm);
        System.out.println("Total Fare :"+totalFare);
    }
}