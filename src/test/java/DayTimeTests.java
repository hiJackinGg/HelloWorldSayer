import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayTimeTests {

    @Test
    public void DayTimeTest(){
        assertEquals(6, DayTime.MORNING_START.hour());
        assertEquals(9, DayTime.MORNING_END.hour());
        assertEquals(9, DayTime.DAY_START.hour());
        assertEquals(19, DayTime.DAY_END.hour());
        assertEquals(19, DayTime.EVENING_START.hour());
        assertEquals(23, DayTime.EVENING_END.hour());
        assertEquals(23, DayTime.NIGHT_START.hour());
        assertEquals(6, DayTime.NIGHT_END.hour());
    }

}
