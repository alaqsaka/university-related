public class MethodOverload {
    int hasilKuadratInt;
    double hasilKuadratDouble;

    public MethodOverload(){
        System.out.println("DEMO METHOD OVERLOADING");
        System.out.println("-----------------------");
        System.out.println("");
    }

    public void kuadrat(int angka){
        hasilKuadratInt = angka * angka;
        System.out.println("Method 'kuadrat' pertama");
        System.out.println("Hasil kuadrat " + angka + " adalah: " + hasilKuadratInt);
        System.out.println("");
    }

    public void kuadrat(double angka){
        System.out.println("Method 'kuadrat' kedua");
        hasilKuadratDouble =  angka * angka;
        System.out.println("Hasil kuadrat " + angka + " adalah: " + hasilKuadratDouble);
    }

}
