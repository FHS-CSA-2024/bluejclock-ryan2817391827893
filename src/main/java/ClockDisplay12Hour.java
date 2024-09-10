package src.main.java;


public class ClockDisplay12Hour
{//upload 12h and driver
    public NumberDisplay h;
    public NumberDisplay m;
    public NumberDisplay s;
    public boolean morning;
    public String display;
    public ClockDisplay12Hour(){
        h = new NumberDisplay(24);
        m = new NumberDisplay(60);
        s = new NumberDisplay(60);
        updateDisplay();
    }
    public String getTime(){
        return display;
    }
    public void updateDisplay(){
        String output = "";
        String L = "";
        if (morning == true)
        {
            L = " A.M.";
        }
        else{
            L = " P.M.";
        }
        output = h.getDisplayValue()+":"+m.getDisplayValue()+":"+s.getDisplayValue()+L;
        display = output;
    }
    public void setTime(int h1, int m1, int s1, boolean mo){
        h.setValue(h1);
        m.setValue(m1);
        s.setValue(s1);
        morning = mo;
        updateDisplay();
    }
    public void timeTick(){
        s.increment();
        if(s.getValue()==0)
        {
            m.increment();
        }
        if((m.getValue()==0)&&(s.getValue()==0)){
            h.increment();
        }
        if((h.getValue()%12==0)&&(m.getValue()==0)&&(s.getValue()==0)){
            morning = !morning;
        }
        if(h.getValue()%12==1){
            h.setValue(h.getValue()-12);
        }        
        updateDisplay();
    }
}
