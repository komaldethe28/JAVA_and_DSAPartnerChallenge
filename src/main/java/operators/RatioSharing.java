/*
Q23: Ratio Sharing
Story
₹900 is shared between two people in ratio 2:1. Find share of first person
*/

class RatioSharing {
    public static void main(String[] args) {
        double total=900;
        int person1Units=2;
        int person2Units=1;
        int totalUnits=person1Units+person2Units;
        double singleUnitShare=total/totalUnits;
        double firstPersonsShare=person1Units*singleUnitShare;
        System.out.println("First persons share is :"+firstPersonsShare);
    }
}