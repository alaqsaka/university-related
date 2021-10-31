import java.util.*;

public class assignment2a {
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT 2A LOOP & TIPE VARIABLE");
        System.out.println("Nama: Al Aqsa Krisnaya Abidin NIM: 2010511102");
        Scanner sc = new Scanner(System.in);
        String yesOrNo = "Y";

        int userInput;

        do {
            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
                System.out.print("Masukkan sebuah integer empat angka digit:  ");
                // Meminta masukkan user untuk empat digit
                userInput = sc.nextInt();
                // Mencetak angka dari empat digit
                cetakAngka(userInput);
                System.out.print("\nMau mengulangi lagi? (Y/N) ");
                yesOrNo = sc.next();
            } else {
                System.out.println("Salah input");
                break;
            }

        } while (!Objects.equals(yesOrNo, "N") ||!Objects.equals(yesOrNo, "n") );

        System.out.println("\nSelesai … Terima kasih dari aqsaabidin15@gmail.com");
    }

    public static void cetakAngka(Integer angka){

        String num = angka.toString();
        char[] ch = new char[num.length()];

        for (int i = 0; i < num.length(); i++) {
            ch[i] = num.charAt(i);
        }

        List<Character> list = new ArrayList<>();

        List<Character> listAngka = new ArrayList<>();

        for (int i =0; i<num.length(); i++){
            list.add(ch[i]);
        }

        for(int i = 0; i<3; i++){
            if (i < (4 - ch.length)) {
                listAngka.add(null);
            }
        }

        for (char c : ch) {
            listAngka.add(c);
        }

        System.out.println("\n");
        if(listAngka.get(0) == null){
            System.out.println("Angka ribuan adalah: 0");
        } else {
            System.out.println("Angka ribuan adalah: " + listAngka.get(0));
        }

        if(listAngka.get(1) == null){
            System.out.println("Angka ratusan adalah: 0");
        } else {
            System.out.println("Angka ratusan adalah: " + listAngka.get(1));
        }

        if(listAngka.get(2) == null){
            System.out.println("Angka puluhan adalah: 0");
        } else {
            System.out.println("Angka puluhan adalah: " + listAngka.get(2));
        }

        if(listAngka.get(3) == null){
            System.out.println("Angka satuan adalah: 0");
        } else {
            System.out.println("Angka satuan adalah: " + listAngka.get(3));
        }
    }
}
