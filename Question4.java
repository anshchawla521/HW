public class Question4 {
    public static void main(String[] args)
    {
        int a = 25;
        int b = 45;
        System.out.println("A before Swap " + a);
        System.out.println("B before Swap " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("A after  1st Swap " + a);
        System.out.println("B after  1st Swap " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A after  2nd Swap " + a);
        System.out.println("B after  2nd Swap " + b);
    }

    }
