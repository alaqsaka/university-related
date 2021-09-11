import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaMotor;
        int hargaJualTunai;
        int cicilanPerbulan;
        char jualTunai;

        System.out.print("Harga Motor: ");
        hargaMotor = sc.nextInt();

        System.out.print("Jual tunai (y/n): ");
        jualTunai = sc.next().charAt(0);

        if (jualTunai == 'y') {
            int potonganHarga;
            potonganHarga = hargaMotor * 5/100;
            hargaJualTunai = hargaMotor - potonganHarga;
            System.out.println("Harga jual = " + hargaJualTunai);
        } else if (jualTunai == 'n'){
            int tambahanBiaya;
            int hargaJual;
            tambahanBiaya = hargaMotor * 20/100;
            hargaJual = hargaMotor + tambahanBiaya;
            cicilanPerbulan = hargaJual / 12;
            System.out.println("Cicilan perbulan = " + cicilanPerbulan);
        }

    }
}
