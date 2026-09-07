class AlphaRever{
	public static void main(String [] args){
	printAlph((char)64);
	}
public static void printAlph(char ch){
	if(ch++ =='Z') return ;
	printAlph(ch);
	System.out.print(ch+ " ");
	}
}