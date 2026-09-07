class NumberRec{
	public static void main(String [] args ){
	printNumber(1);
	}
	public static void printNumber(int num){
		System.out.print(num+ " ");
		num++;
		if(num>10) return;
		printNumber(num);
	}
}