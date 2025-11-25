
import java.util.Scanner;

class AutomorphicNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one digit number: ");
        int a = sc.nextInt();
        int mul = a*a;
        int temp = mul % 10;
        if(a == temp){
            System.out.println("It is automorphic");
        }
        else{
            System.out.println("It is not automorphic");
        }
        
    }
}