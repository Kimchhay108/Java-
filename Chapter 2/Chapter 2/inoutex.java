import  java.util.Scanner;

public class inoutex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
            "Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please Enter your age: ");
        int age = scanner.nextInt();

        //output
        System.out.printf("Your name is: "+name+"and your age is: "+age);
       
        
        scanner.close();
    }
    
}
