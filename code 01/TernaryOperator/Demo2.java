class Demo2{
	public static void main (String [] args){
		char a='A';
		int b =123;
		boolean useChar = args.length == 0;

		int c= useChar ? a:b ;
		System.out.println(c);
	}
}

// output= 65