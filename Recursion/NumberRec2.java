class NumberRec2{
	static int num=1;
	public static void main(String [] args ){
	printNumber();
	}
	public static void printNumber(){
		System.out.print(num+ " ");
		num++;
		if(num>10) return;
		printNumber();
	}
}