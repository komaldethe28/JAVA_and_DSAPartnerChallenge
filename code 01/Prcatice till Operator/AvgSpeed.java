class AvgSpeed{
	public static void main (String[] args){
		double  distance=24;
		double  kilometrePerMiles=1.6;
		double  distanceInKm = distance* kilometrePerMiles;

		System.out.println("Distance In Km:- " + distanceInKm + "km");

		double timeInHours = 1 + (40 / 60.0) + (35 / 3600.0);  //note:- .0 is requested bcz it will give decimal value
		double averageSpeed = distanceInKm / timeInHours;

		System.out.println("Average Speed:- " + averageSpeed + "km/h");
	}
}