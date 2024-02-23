import java.io.PrintStream;
import java.util.Scanner;

public class Class {
    static PrintStream out = System.out;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        User user1 = new User(sc.nextLine(), sc.nextInt(), sc.nextLine().equalsIgnoreCase("male"));
        out.println(" Hi! My name is "  + user1.name + ". I am " + user1.age + " old years");
        out.println(user1.isMale);
    }
}
