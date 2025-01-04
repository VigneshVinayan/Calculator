import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple calculatior");
        System.out.println("Choose your operator");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        String choice = sc.nextLine();

        System.out.println("Enter two numbers");

        float n1 = sc.nextFloat();
        
        float n3=0;
        
        switch(choice){
            case "Addition":
                n3=n1+n2;
                break;

            case "Subtraction":
                n3=n1-n2;
                break;

            case "Mutiplication":
                n3=n1*n2;
                break;

            case "Division":
                n3=n1/n2;
                break;
            
            }
    
            System.out.println(choice+" : "+n3);
    
        
    }
    
}
