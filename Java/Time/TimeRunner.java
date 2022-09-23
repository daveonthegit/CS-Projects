package Time;


public class TimeRunner {
    private static boolean isTimeEqual(Time time1, Time time2) {
        if ((time1.hrs == time2.hrs) & (time1.mins == time2.mins) & (time1.secs == time2.secs)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Time t1 = new Time(12, 55, 30);
        Time t2 = new Time(23, 59, 59);
        Time t3 = new Time(4, 20, 4);

        t1.printTime();
        t2.printTime();
        t3.printTime();
        t3.increment();
        t3.printTime();
        t2.reset(24, 60, 60);
        t2.printTime();
        t2.increment();
        t2.printTime();
        System.out.println(isTimeEqual(t1,t2));
    }
}
