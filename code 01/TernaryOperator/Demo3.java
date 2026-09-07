class Demo3 {
    public static void main(String[] args) {
        boolean useMiddleCharacter = args.length > 0;
        char a = useMiddleCharacter ? "ABC".charAt(1) : 'A';
        System.out.println(a);
    }
}

// output - A