class Demo1 {
    public static void main(String[] args) {
        boolean useHello = args.length == 0;
        String str = useHello ? "HELLO" : "456";
        System.out.println(str);
    }
}