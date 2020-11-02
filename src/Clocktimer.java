public class Clocktimer extends Subject {

    private int hours = 19;
    private int minutes = 19;
    private int seconds = 19;

    public int getHour() {
        return this.hours;
    }
    public int getMinute() {
        return this.minutes;
    }
    
    public int getSecond() {
        return this.seconds;
    }        
    void tick() {
        notify();
    }
}
