class Demo5{
	public static void main (String [] args){
		byte a= 1;
		short b= 2;
		boolean useByte = args.length == 0;

		int c = useByte ? a:b;
System.out.println(c);

	}
}