public class Rectangle {
    double length, width;

    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double s){
        this.length = s;
        this.width = s;
    }

    public Rectangle(String s){
        double sisi =  Double.parseDouble(s);
        this.length = sisi;
        this.width = sisi;
    }

    public Rectangle(double panjang, double lebar){
        this.length = panjang;
         this.width = lebar;
    }

    public void keliling(){
        double keliling = (this.length * 2) + (this.width *2);
        System.out.println("keliling: " + keliling);
    }

    public void luas(){
        double luas = this.length * this.width;
        System.out.println("Luas: "+ luas);
    }

}
