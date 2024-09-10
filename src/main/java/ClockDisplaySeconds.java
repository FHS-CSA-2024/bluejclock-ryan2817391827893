package src.main.java;


public class ClockDisplaySeconds
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }
    public void timeTick(){
        seconds.increment();
        if(seconds.getValue()==0)
        {
            minutes.increment();
        }
        if(minutes.getValue()==0){
            hours.increment();
        }
        updateDisplay();
    }
    public String getTime(){
        return display;
    }
    public void updateDisplay(){
        String output = "";
        
        output = hours.getDisplayValue()+":"+minutes.getDisplayValue()+":"+seconds.getDisplayValue();
        display = output;
    }
    public void setTime(int h, int m, int s){
        hours.setValue(h);
        minutes.setValue(m);
        seconds.setValue(s);
        updateDisplay();
    }
}
