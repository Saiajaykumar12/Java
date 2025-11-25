
import java.util.Scanner;

class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Area of a circle");
        System.out.println("2) Area of a square");
        System.out.println("3) Area of a rectangle");
        int input = sc.nextInt();
        switch(input) {
            case 1:{
                double radius = sc.nextDouble();
                double area = Math.PI * radius * radius;
                System.out.println("Area of a circle "+area);
                break;
            }
            case 2:{
                int side = sc.nextInt();
                double area = side * side;
                System.out.println("Area of a square "+area);
                break;
            }
            case 3:{
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                double area = length * breadth;
                System.out.println("Area of a rectangle"+area);
                break;
            }
            default:{
                System.out.println("Enter the correct input");
            }
        }
    }
}