/*
Q15: Party Cost Split with Extra Charges
Story
Friends order food. Service charge is added, then bill is split
*/

class PartCostSplit {
    public static void main(String[] args) {
        double foodBill=3000.0;
        double serviceChargeRate=0.10; //10%
        double serviceCharges=foodBill*serviceChargeRate;
        int noOfFriends=5;
        double eachSplit=(foodBill+serviceCharges)/noOfFriends;
        System.out.println("Everyone has to pay :"+eachSplit+"rs");
    }
}