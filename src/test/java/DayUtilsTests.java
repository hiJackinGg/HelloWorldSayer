import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayUtilsTests {


    @Test
    public void getDayPeriodByHourTest(){
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(0));
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(1));
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(2));
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(3));
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(4));
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(5));
        assertEquals(DayPeriod.MORNING, DayUtils.getDayPeriodByHour(6));
        assertEquals(DayPeriod.MORNING, DayUtils.getDayPeriodByHour(7));
        assertEquals(DayPeriod.MORNING, DayUtils.getDayPeriodByHour(8));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(9));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(10));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(11));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(12));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(13));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(14));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(15));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(16));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(17));
        assertEquals(DayPeriod.DAY, DayUtils.getDayPeriodByHour(18));
        assertEquals(DayPeriod.EVENING, DayUtils.getDayPeriodByHour(19));
        assertEquals(DayPeriod.EVENING, DayUtils.getDayPeriodByHour(20));
        assertEquals(DayPeriod.EVENING, DayUtils.getDayPeriodByHour(21));
        assertEquals(DayPeriod.EVENING, DayUtils.getDayPeriodByHour(22));
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(23));
        assertEquals(DayPeriod.NIGHT, DayUtils.getDayPeriodByHour(24));

        assertEquals(null, DayUtils.getDayPeriodByHour(-24));
        assertEquals(null, DayUtils.getDayPeriodByHour(1000));
    }

    @Test(expected=NullPointerException.class)
    public void DayPeriodTestArgNull(){
        Integer nl = null;
        DayUtils.getDayPeriodByHour(nl);
    }

}
