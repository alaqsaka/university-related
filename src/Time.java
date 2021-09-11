public class Time {
    int hour;
    int minute;
    int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
        System.out.println(h + " " + m + " " + s);
    }

    public void toUniversalString() {
        int h = hour;
        int m = minute;
        int s = second;
        hour = 0 <= h && !(24 <= h) ? h : 0;

        if (m >= 0 && m < 60 ) {
            minute = m;
        } else {
            minute = 0;
        }

        if (s>= 0 && s <60) {
            second =s;
        } else {
            second = 0;
        }

        System.out.println("Universal Time: " + hour + ":" + minute + ":" + second);
    }

    public String toString() {
        if (hour == 0 || hour == 12) {
            if (hour < 12)
                System.out.println("Standard Time: " +12+":"+minute+":"+second+" AM");
            else
                System.out.println("Standard Time: " +12+":"+minute+":"+second+" PM");
        } else {
            if (hour < 12)
                System.out.println("Standard Time: " +(hour % 12) + ":"+minute+":"+second+" AM");
            else
                System.out.println("Standard Time: " +(hour % 12) + ":"+minute+":"+second+" PM");
        }

        return null;
    }

}
