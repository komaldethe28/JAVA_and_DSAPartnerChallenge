class RecFactorial1{
	public static void main(String [] args){
		int num =4;
		int op =findFactorial(num,1,1);
		System.out.println(op);
	}
		public static int findFactorial(int num, int i, int op){
			op=op * i;
			i++;
			if(i>num) return op;
			return findFactorial(num, i, op);
	}
}