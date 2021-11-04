import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
        sc.close();

    }
}
