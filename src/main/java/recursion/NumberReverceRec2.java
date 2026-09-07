/* class NumberReverceRec2{
	static int num=10;
	public static void main(String [] args ){
	printNumber();
	}
	public static void printNumber(){
		System.out.print(num+ " ");
		num--;
		if(num<0) return;
		printNumber();
	}
}
*/
class NumberReverceRec2{
	public static void main(String [] args ){
	printNumber(10);
	}
	public static void printNumber(int num){
		System.out.print(num+ " ");
		num--;
		if(num<0) return;
		printNumber(num);
	}
}