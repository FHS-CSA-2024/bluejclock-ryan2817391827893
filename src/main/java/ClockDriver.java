package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("empty test - "+test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3,45);
        String test2Output = test2.getTime();
        System.out.println("2 arg test - "+test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        System.out.println("tick test 1 pre - "+tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("tick test 1 post - "+tickTest1.getTime());
        
        ClockDisplay tickTest2 = new ClockDisplay(3,9);
        System.out.println("tick test 2 pre - "+tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("tick test 2 post - "+tickTest2.getTime());
        
        ClockDisplay tickTest3 = new ClockDisplay(1,59);
        System.out.println("tick test 3 pre - "+tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("tick test 3 post - "+tickTest3.getTime());
        
        ClockDisplay tickTest4 = new ClockDisplay(9,59);
        System.out.println("tick test 4 pre - "+tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("tick test 4 post - "+tickTest4.getTime());
        
        ClockDisplay tickTest5 = new ClockDisplay(23,59);
        System.out.println("tick test 5 pre - "+tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("tick test 5 post - "+tickTest5.getTime());
        System.out.println("");
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds test3 = new ClockDisplaySeconds();
        String test3Output = test3.getTime();
        System.out.println("empty test - "+test3Output);
        
        ClockDisplaySeconds test4 = new ClockDisplaySeconds(3,45,45);
        String test4Output = test4.getTime();
        System.out.println("2 arg test - "+test4Output);
        
        ClockDisplaySeconds t1 = new ClockDisplaySeconds(3,32,59);
        System.out.println("test 1 pre - "+t1.getTime());
        t1.timeTick();
        System.out.println("test 1 post - "+t1.getTime());
        
        ClockDisplaySeconds t2 = new ClockDisplaySeconds(1,0,59);
        System.out.println("test 2 pre - "+t2.getTime());
        t2.timeTick();
        System.out.println("test 2 post - "+t2.getTime());
        
        ClockDisplaySeconds t3 = new ClockDisplaySeconds(1,59,59);
        System.out.println("test 3 pre - "+t3.getTime());
        t3.timeTick();
        System.out.println("test 3 post - "+t3.getTime());
        
        ClockDisplaySeconds t4= new ClockDisplaySeconds(23,59,59);
        System.out.println("test 4 pre - "+t4.getTime());
        t4.timeTick();
        System.out.println("test 4 post - "+t4.getTime());
        System.out.println("");
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour test5 = new ClockDisplay12Hour();
        String test5Output = test5.getTime();
        System.out.println("empty test - "+test5Output);
        ClockDisplay12Hour test6 = new ClockDisplay12Hour(3,45,45,true);
        String test6Output = test6.getTime();
        System.out.println("empty test - "+test6Output);
        
        
        ClockDisplay12Hour t10= new ClockDisplay12Hour(3,32,59,false);
        System.out.println("test 1 pre - "+t10.getTime());
        t10.timeTick();
        System.out.println("test 1 post - "+t10.getTime());
        
        ClockDisplay12Hour t20= new ClockDisplay12Hour(11,59,59,false);
        System.out.println("test 2 pre - "+t20.getTime());
        t20.timeTick();
        System.out.println("test 2 post - "+t20.getTime());
        
        ClockDisplay12Hour t30= new ClockDisplay12Hour(11,59,59,true);
        System.out.println("test 3 pre - "+t30.getTime());
        t30.timeTick();
        System.out.println("test 3 post - "+t30.getTime());
        
        ClockDisplay12Hour t40= new ClockDisplay12Hour(12,59,59,false);
        System.out.println("test 4 pre - "+t40.getTime());
        t40.timeTick();
        System.out.println("test 4 post - "+t40.getTime());
                
    }
}
