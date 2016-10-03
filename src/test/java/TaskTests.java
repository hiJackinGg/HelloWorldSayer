
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class TaskTests {


    /**
     * классы еквивалентности:
     * morning [6-9)
     * day [9-19)
     * evening [19-23)
     * night [23-6)
     * hours [0-23]
     */
    @Test
    public void getDayPeriodByHourTest(){

        assertEquals("night", Task.getDayPeriodByHour(0));
        assertEquals("night", Task.getDayPeriodByHour(23));

        assertEquals("morning", Task.getDayPeriodByHour(6));
        assertEquals("day", Task.getDayPeriodByHour(9));
        assertEquals("evening", Task.getDayPeriodByHour(19));
        assertEquals("night", Task.getDayPeriodByHour(23));

        assertEquals(null, Task.getDayPeriodByHour(24));

        assertEquals(null, Task.getDayPeriodByHour(-23));
        assertEquals(null, Task.getDayPeriodByHour(1000));
    }

    @Test
    public void sayHelloTest(){
        Task.sayHello();
    }

}
