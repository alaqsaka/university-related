import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first_name;
        String middle_name;
        String last_name;

        System.out.println("Enter your firstname:");
        first_name = sc.nextLine();
        System.out.println("Enter your middle name:");
        middle_name = sc.nextLine();
        System.out.println("Enter your last name:");
        last_name = sc.nextLine();

        System.out.println("Your full name is " + first_name + " " + middle_name + " " + last_name);
    }
}
