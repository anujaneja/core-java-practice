
@FunctionalInterface
interface FunctionalInterface1 {
    public int sum(int a, int b);
}

public class FunctionalInterfaceTest {
    public static void main(String[] s) {
        FunctionalInterface1 functionalInterface1 = (a,b) -> {
            return a+b;
        };

        int c= functionalInterface1.sum(1,2);
        System.out.println("c="+c);

        System.out.println("Lets run a thread");

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName()+"Started running");
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
            System.out.println("******");
            System.out.println("*******");
            System.out.println("********");
            System.out.println("*********");
            System.out.println("**********");
            System.out.println("************");
            System.out.println("*************");
            System.out.println("************");
            System.out.println("***********");
            System.out.println("***********");
            System.out.println("**********");
            System.out.println("*********");
            System.out.println("********");
            System.out.println("*******");
            System.out.println("******");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
            System.out.println(Thread.currentThread().getName()+"End");
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}