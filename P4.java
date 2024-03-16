import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        radius = sc.nextInt();
        double circumference= Math.PI * 2*radius;
    System.out.printf( "\nCircumference is: %.2f",circumference) ;
        
    }
    
}
