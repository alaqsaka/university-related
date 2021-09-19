public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4);
        r1.keliling();
        r1.luas();

        Rectangle r2 = new Rectangle(4);
        r2.keliling();
        r2.luas();

        Rectangle r3 = new Rectangle("6");
        r3.keliling();
        r3.luas();

        Rectangle r4 = new Rectangle(2.0, 3.0);
        r4.keliling();
        r4.luas();
    }
}
