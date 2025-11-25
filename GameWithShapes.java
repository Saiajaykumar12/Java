import java.util.Scanner;
class GameWithShapes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        float radius = sc.nextFloat();
        System.out.println("Enter the length of the square: ");
        int length = sc.nextInt();
        if(radius <= (0.5 * length)){
            System.out.println("Circle can be inside a square");
        }
        else{
            System.out.println("Circle cannot be inside a square");
        }
        sc.close();
    }
}