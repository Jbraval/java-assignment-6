
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int m= sc.nextInt();
        System.out.println("Enter the binary number: ");
        int n= sc.nextInt();
        int decimalnum=0;
        int power =1;
        while(n!=0){
            int rem =n%2;
            decimalnum+=rem*power;
            power*=2;
            n/=10;
        }
        System.out.println(m+decimalnum);
    }
}
