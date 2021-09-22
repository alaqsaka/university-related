public class GameOopTest {
    public static void main(String[] args) {
        GameOop WiroSableng = new GameOop(
                "Wiro Sableng",
                10,
                20);
        GameOop Gundala = new GameOop(
                "Gundala",
                5,
                25);

        WiroSableng.tendang(Gundala);
        Gundala.tendang(WiroSableng);

        for (int i=0; i<= 2; i++){
            Gundala.pukul(WiroSableng);
        }

        for (int i=0; i<=3; i++){
            WiroSableng.tendang(Gundala);
        }

        System.out.println("Lifepoint " + WiroSableng.getName() +
                ": " + WiroSableng.getLifePoint());
        System.out.println("Lifepoint " + Gundala.getName() +
                ": " + Gundala.getLifePoint());

        if (WiroSableng.getLifePoint() < Gundala.getLifePoint()){
            System.out.println(Gundala.getName() + " Menang!");
        } else
            System.out.println(WiroSableng.getName() + " Menang!");
    }
}
