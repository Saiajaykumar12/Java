
import java.util.Scanner;

class ThreeTopics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of the topic you want to choose: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        if(A==X || B==X || C==X){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }   
    }
}