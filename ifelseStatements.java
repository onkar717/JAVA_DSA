import java.util.Scanner;

public class ifelseStatements {
    public static void main(String[] args) {
        System.out.println("Please Enter the Marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 33) {
            System.out.println("pass");
        }
        else if (marks < 33) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Please Enter Marks");
        }
    }
}
