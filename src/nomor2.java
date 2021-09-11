import java.util.Arrays;
import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String full_name;
        System.out.println("Enter your full-name:");
        full_name = sc.nextLine();

        String [] nama = full_name.split(" ", 3);
        System.out.println("Your first name is " + nama[0]);

    }
}
