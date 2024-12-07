import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
            "Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please Enter your age: ");
        int age = scanner.nextInt();
        
        int born = (age*365);
        //output
        System.out.printf("Your name is: "+name+"\tand your age is: "+born);
    }
}
