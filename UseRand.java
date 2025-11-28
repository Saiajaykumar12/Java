import java.util.Random;

class UseRand{
    public static void main(String[] args) {
        Random r = new Random();
        // for(int i=0;i<5;i++){
        //     int n = r.nextInt(10);
        //     System.out.println(n);
        // }

        System.out.println("Enter a value");
        int a = r.nextInt(10);
        System.out.println("a value is: " + a);
        System.out.println("Enter b value: ");
        int b = r.nextInt(10);
        System.out.println("b value is: " + b);

        int c = a + b;

        System.out.println("Sum is: " + c);
    }
}