class Demo4 {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
		boolean useByte = args.length == 0;

        short c = useByte ? a : b;
        System.out.println(c);
    }
}

// O/P = 1 (Byte can store in short)