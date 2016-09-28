import org.apache.log4j.Logger;


public class DayUtils {

    private static final Logger log = Logger.getLogger(DayUtils.class);

    /**
     * Defines day period by hour.
     * @param hour hour of day.
     * @return defined day period. If day period is not defined, returns null.
     */
    public static DayPeriod getDayPeriodByHour(int hour){

        if (hour >= DayTime.MORNING_START.hour() &&
                hour < DayTime.MORNING_END.hour()){

            log.info(hour + " hours." + "It's morning");

            return DayPeriod.MORNING;
        }

        else if (hour >= DayTime.DAY_START.hour() &&
                hour < DayTime.DAY_END.hour()){

            log.info(hour + " hours." + "It's day");

            return DayPeriod.DAY;
        }

        else if (hour >= DayTime.EVENING_START.hour() &&
                hour < DayTime.EVENING_END.hour()){

            log.info(hour + " hours." + "It's evening");

            return DayPeriod.EVENING;
        }

        else if ((hour >= DayTime.NIGHT_START.hour() && hour <= 24) ||
                hour < DayTime.NIGHT_END.hour() && hour >= 0){

            log.info(hour + " hours." + "It's night");

            return DayPeriod.NIGHT;
        }

        log.warn(hour + ". Undefined day period");

        return null;
    }

}
