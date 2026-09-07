class PopulationTast
{
	public static void main(String[] args)
	{
		long population = 312032486;
		long birth = (365 * 24 * 60 * 60) / 7; 
		long death = (365 * 24 * 60 * 60) / 13; 
		long immigrant = (365 * 24 * 60 * 60) / 45; 
		long oneYear = population +((birth + immigrant - death)* 5);
		System.out.println("Population in Five Years: " + oneYear);
		
		long population1 = 312032486;
		long birth1 = ((365 * 24 * 60 * 60) / 7)* 5;
		long death1 = ((365 * 24 * 60 * 60) / 13)* 5;
		long immigrant1 = ((365 * 24 * 60 * 60) / 45)* 5;
		long changePop = population1 + birth1 - death1 + immigrant1;

		System.out.println("Population in 5th Year: " + changePop);
		
		System.out.println(oneYear*5 - changePop);
	}	
}