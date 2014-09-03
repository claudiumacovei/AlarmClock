package application;

import java.sql.Time;
import java.util.Calendar;

public class AlarmThread implements Runnable {
    
    private Time alarmTime = null;
    
    public AlarmThread(Time alarmTime) {
    
        super();
        this.alarmTime = alarmTime;
    }
    
    @Override
    public void run() {
    
        while (true) {
            if (Calendar.getInstance().getTime().equals(alarmTime)) {
                SongPlayer thread = new SongPlayer();
                thread.run();
            }
        }
    }
    
}
