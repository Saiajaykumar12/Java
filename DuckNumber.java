
import java.util.Scanner;

class DuckNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String n = sc.next();
        if(n.charAt(0) == '0'){
            System.out.println(n+" is not a duck number");
            return;
        }
        boolean hasZero = false;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == '0'){
                hasZero = true;
                break;
            }
        }
        if(hasZero){
            System.out.println(n+" is a duck number");
        }
        else{
            System.out.println(n+" is not a duck number");
        }
    }
}