public class Pecahan {
    private int pembilang, penyebut;

    public Pecahan(int pembilang, int penyebut){
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public int getPembilang(){
        return pembilang;
    }

    public void setPembilang(int pembilang){
        this.pembilang=pembilang;
    }

    public int getPenyebut(){
        return penyebut;
    }

    public void setPenyebut(int penyebut) {
        this.penyebut = penyebut;
    }

    public void tambah(Pecahan p){
        int perkalianPenyebut = penyebut * p.penyebut;

        int jumlahPembilang = (pembilang * p.penyebut) + (p.pembilang * penyebut);
        System.out.println(pembilang+"/"+penyebut+" + "
                +p.pembilang +"/"+p.penyebut +" = "
                +jumlahPembilang+"/"+perkalianPenyebut);

    }
}
