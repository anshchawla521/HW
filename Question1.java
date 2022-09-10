class hello {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        if(args.length == 2){
            try{
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException ex){
                System.out.println("the supplied arguments raised an error");
            }
        }
        System.out.println("The sum of two numbers is " + (a + b));
        System.out.println("The difference of two numbers is " + (a - b));
    }
}