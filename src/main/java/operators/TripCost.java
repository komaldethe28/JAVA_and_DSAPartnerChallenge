/* Q13: Trip Cost (Fuel + Toll)
Story
Rahul travels a distance. He spends on fuel and also pays toll charges. Find total trip cost.
*/
//mileage=km/lit

class TripCost {
    public static void main(String[] args) {
        int distance=200;
        int mileage=20;
        int petrolPrice=100;
        int toll=300;
        double totalFuel=distance/mileage;
        double tripCost=totalFuel*petrolPrice+toll;
        System.out.println("Total trip cost :"+tripCost);
    }
}