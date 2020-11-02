public class DigitalClock implements Observer {

    private Clocktimer timer;

    public DigitalClock(Clocktimer ct) {
        timer = ct;
        timer.attach(this);
    }

    @Override
    public void update(Subject s) {
        if (s == timer) {
            draw();
        }

    }
    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        System.out.println(hour+":"+minute+":"+second);
    }

}