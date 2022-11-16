import java.util.Scanner;

public class goodDay {
 public static void main (String[] args) {
    // we are going to make the program for greating name
    System.out.println("Enter your Name");
    Scanner sc = new Scanner(System.in);
    // System.out.println("Hii");
    String name = sc.nextLine();
    System.out.println( " hii "+ name + " good night !");   
}

}