
public enum DayPeriod {

    MORNING("06:00 - 09:00"),

    DAY("09:00 - 19:00"),

    EVENING("19:00 - 23:00"),

    NIGHT("23:00 - 06:00");

    private String time;

    DayPeriod (String time) {
        this.time = time;
    }

    public String timePeriod() {
        return time;
    }

}
