import java.util.Scanner;

class LoginPage{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        Scanner uname = new Scanner(userName);
        Scanner pass = new Scanner(password);

        if(uname.hasNext("ajay@gmail.com") && pass.hasNext("ajay1234")){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }
}