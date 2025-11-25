import java.util.Scanner;

class StudentResultSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        int rollNumber = sc.nextInt();
        System.out.println("Enter the Name of the student: ");
        String name = sc.next();
        int total = 0;
        System.out.println("Enter subject1 marks: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter subject2 marks: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter subject3 marks: ");
        int marks3 = sc.nextInt();
        System.out.println("Enter subject4 marks: ");
        int marks4 = sc.nextInt();
        System.out.println("Enter subject5 marks: ");
        int marks5 = sc.nextInt();
        total = marks1+marks2+marks3+marks4+marks5;
        System.out.println("Total marks = "+total);
        int avg = total/5;
        System.out.println("Average = "+avg);
        if(total > 250){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}