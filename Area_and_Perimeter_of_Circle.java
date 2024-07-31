import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        Float a;
        Scanner read = new Scanner(System.in);
        a = read.nextFloat();
        
        float area, perimeter;
        float c =a*a;
        area = (float)3.14 * c;
        perimeter = 2 * (float)3.14 * a;
        System.out.printf("%.2f
",area);
        System.out.printf("%.2f",perimeter);
    }   
}   