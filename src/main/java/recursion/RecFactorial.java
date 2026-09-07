class RecFactorial{
	static int op=1;
	public static void main(String [] args){
		int num =4;
		findFactorial(4,1);
		System.out.println(op);
	}
		public static void findFactorial(int num, int i){
			op*= i;
			i++;
			if(i>num) return;
			findFactorial(num,i);
	}
}