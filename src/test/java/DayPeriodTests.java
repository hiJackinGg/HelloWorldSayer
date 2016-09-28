import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DayPeriodTests {

    @Test
    public void DayPeriodTest(){
        assertEquals("06:00 - 09:00", DayPeriod.MORNING.timePeriod());
        assertEquals("09:00 - 19:00", DayPeriod.DAY.timePeriod());
        assertEquals("19:00 - 23:00", DayPeriod.EVENING.timePeriod());
        assertEquals("23:00 - 06:00", DayPeriod.NIGHT.timePeriod());
    }

}
