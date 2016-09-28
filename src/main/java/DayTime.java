
public enum DayTime {

    MORNING_START(6),

    MORNING_END(9),

    DAY_START(9),

    DAY_END(19),

    EVENING_START(19),

    EVENING_END(23),

    NIGHT_START(23),

    NIGHT_END(6);

    private int hour;

    DayTime(int hour) {
        this.hour = hour;
    }

    public int hour() {
        return hour;
    }

}
