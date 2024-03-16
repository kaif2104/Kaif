import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        int Radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        Radius = sc.nextInt();
        double circumference= Math.PI * 2*Radius;
    System.out.printf( "\nCircumference is: %.2f",circumference) ;
        
    }
    
}
