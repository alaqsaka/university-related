public class GameOop {
    private String name;
    private int lifePoint;
    private int powerTendangan;
    private int powerPukulan;

    public GameOop(String name, int PowerTendangan, int PowerPukulan){
        this.name = name;
        this.powerTendangan = PowerTendangan;
        this.powerPukulan = PowerPukulan;
        this.lifePoint = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tendang  (GameOop karB) {
        karB.lifePoint = karB.lifePoint - this.powerTendangan;
    }

    public void pukul (GameOop karB){
        karB.lifePoint = karB.lifePoint - this.powerPukulan;
    }

    public int getLifePoint() {
        return lifePoint;
    }
}
