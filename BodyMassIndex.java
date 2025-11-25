
import java.util.Scanner;

class BodyMassIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight(in KG) of your body: ");
        float weight = sc.nextFloat();
        System.out.println("Enter the height(in meters) of your body: ");
        float height = sc.nextFloat();
        System.out.println("The BMI is: ");
        float bmi = weight / (height*height);
        if(bmi < 18.5){
            System.out.println("You are underweight. Have an apple daily.");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("You are normal. Go for a walk every day and maintain it.");
        }
        else if(bmi>=25 && bmi<=29.9){
            System.out.println("You are overweight. Go to the gym daily");
        }
        else{
            System.out.println("You are obese. You need to see a doctor.");
        }
    }
}