public class Question3 {
    public static void main(String[] args) {
        float a = (float)20.0;
        float b = (float)30.0;

        if(args.length == 2){
            try{
                a = Float.parseFloat(args[0]);
                b = Float.parseFloat(args[1]);
            }
            catch (Exception ex){
                System.out.println("the supplied arguments raised an error\nso using inbuilt arguments");
            }
        }
        System.out.println("The quotinet of two numbers is " + (a/b));
        System.out.println("The remainder of two numbers is " + (a%b));
    }
}
