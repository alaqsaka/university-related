import java.util.Scanner;

public class assignment2b {
    static Integer jumlahDewasaKeseluruhan = 0;
    static Integer jumlahAnakKeseluruhan = 0;
    static Integer hargaTiketDewasa = 165000;
    static Integer hargaTiketAnak = 125000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiketDewasa = 165000;
        int hargaTiketAnak = 125000;

        System.out.println("PEMBELIAN TIKET DUFAN");
        System.out.println("Created by: Al Aqsa Krisnaya Abidin");
        System.out.println("NIM: 2010511102");

        System.out.println("Harga tiket dewasa (16 tahun keatas) = " + hargaTiketDewasa + " per orang");
        System.out.println("Harga tiket anak - anak (0-s/d 16 tahun) = " + hargaTiketAnak + " per anak");

        String yesOrNo;

        int batch = 1;

        do{
            beliTiket(batch);
            batch++;
            System.out.print("Mau mengulangi lagi? (Y/N) ");
            yesOrNo = sc.nextLine();

        }while(yesOrNo.equals("Y") || yesOrNo.equals("y"));

        rekapPenjualan();
    }

    public static void beliTiket(int batch){
        int jumlahDewasa;
        int jumlahAnak;

        Scanner sc = new Scanner(System.in);

        // Input untuk jumlah tiket dewasan dan anak
        System.out.print("Masukkan jumlah dewasa : ");
        jumlahDewasa = sc.nextInt();
        jumlahDewasaKeseluruhan += jumlahDewasa;
        System.out.print("Masukkan jumlah anak-anak : ");
        jumlahAnak = sc.nextInt();
        jumlahAnakKeseluruhan += jumlahAnak;

        buktiTiketMasuk(batch , jumlahDewasa, jumlahAnak);
    }

    public static void buktiTiketMasuk(int batch,int jmlDewasa, int jmlAnak){
        System.out.println("\n");
        System.out.println("-----------------------------------");
        System.out.println("| BUKTI TIKET MASUK DUNIA FANTASI |");
        System.out.println("| Tanggal  : 10 April 2021        |");
//        System.out.println("| BATCH KE : #" + batch+ "                   |");
        if (batch <10) {
            System.out.println("| BATCH KE : #000" + batch+ "                |");
        } else if (batch < 100){
            System.out.println("| BATCH KE : #00" + batch+ "                |");
        } else if (batch < 1000){
            System.out.println("| BATCH KE : #0" + batch+ "                |");
        } else {
            System.out.println("| BATCH KE : #" + batch+ "                 |");
        }
        System.out.println("| Dewasa   : " + jmlDewasa + "  RP " + (jmlDewasa * hargaTiketDewasa) + "         |");
        System.out.println("| Anak     : " + jmlAnak + "  RP " + (jmlAnak * hargaTiketAnak)       + "         |");
        int total = (jmlDewasa * hargaTiketDewasa) + (jmlAnak * hargaTiketAnak);
        System.out.println("| Total sebelum pajak Rp " + total + "   |");
        int pajak = total * 13/100;
        System.out.println("| Pajak tontonan 13%  Rp " + pajak + "   |");
        System.out.println("| GRAND TOTAL         Rp " + (pajak+total) +"  |");
        System.out.println("-----------------------------------");
    }

    public static void rekapPenjualan(){
        System.out.println("\n");
        System.out.println("CLOSE DAY PROCESS");
        System.out.println("REKAP PENJUALAN TIKET HARI INI TANGGAL: 10 APRIL 2021");
        System.out.println("                               TOTAL");
        System.out.println("Tiket dewasa           : "+jumlahDewasaKeseluruhan +"     Rp  "+ jumlahDewasaKeseluruhan * hargaTiketDewasa);
        System.out.println("Tiket anak             : "+jumlahAnakKeseluruhan+"     Rp  "+jumlahAnakKeseluruhan*hargaTiketAnak);
        System.out.println("Total sebelum pajak    :       Rp  "+((jumlahDewasaKeseluruhan * hargaTiketDewasa) + (jumlahAnakKeseluruhan*hargaTiketAnak)));
        System.out.println("Pajak Tontonan 13%     :       Rp  " + ((jumlahDewasaKeseluruhan * hargaTiketDewasa) + (jumlahAnakKeseluruhan*hargaTiketAnak)) * 13/100);
        int grandTotal = ((jumlahDewasaKeseluruhan * hargaTiketDewasa) + (jumlahAnakKeseluruhan*hargaTiketAnak)) * 13/100 + ((jumlahDewasaKeseluruhan * hargaTiketDewasa) + (jumlahAnakKeseluruhan*hargaTiketAnak));
        System.out.println("GRAND TOTAL                    Rp  " + grandTotal);
    }
}
