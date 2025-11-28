import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("It is consonant");
        }

    }
}