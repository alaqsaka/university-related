public class FibonachiTest {
    public void barisFibonachi(int num) {
        int jumlah=0, jumlah2 =1;
        int i, jumlahTotal;
        System.out.print(jumlah + " " + jumlah2);
        for(i=2; i<num; i++) {
            jumlahTotal = jumlah + jumlah2;
            System.out.print(" " + jumlahTotal);
            jumlah = jumlah2;
            jumlah2 = jumlahTotal;
        }
    }

}
