import org.apache.log4j.Logger;

import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class Task {

    private static final Logger log = Logger.getLogger(Task.class);

    public static void sayHello(){

        //getting user time now
        LocalTime localTime = LocalTime.now();

        log.info("Current local time: " + localTime);

        //getting user local hour now
        final int currentHour = LocalTime.now().getHour();

        log.info("Hour: " + currentHour);

        //find out the day period now
        String dayPeriod = getDayPeriodByHour(currentHour);

        if (dayPeriod == null) {
            log.error("DayPeriod is null !");
            return;
        }else{
            log.info("Current day period now: " + dayPeriod);
        }

        //getting appropriate message from resource bundle
        log.info("Trying to get needed string from resource bundle...");
        log.info("Basename: msg. Key word: " + dayPeriod + ". Locale: " + Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("msg", Locale.getDefault());

        System.out.println(bundle.getString(dayPeriod));
    }

    /**
     * Defines day period by hour.
     * @param hour hour of day. It should be [0; 23].
     * @return defined day period. If day period is not defined, returns null.
     */
    public static String getDayPeriodByHour(int hour){

//        if (hour < 0 || hour >= 24)
//            throw new IllegalArgumentException("Hour: " + hour + "must be in interval [0, 23]");

        if (hour >= 6 && hour < 9){

            log.info(hour + " hours." + "It's morning");

            return "morning";
        }

        else if (hour >= 9 && hour < 19){

            log.info(hour + " hours." + "It's day");

            return "day";
        }

        else if (hour >= 19 && hour < 23){

            log.info(hour + " hours." + "It's evening");

            return "evening";
        }

        else if ((hour >= 23 && hour < 24) ||
                hour < 6 && hour >= 0){

            log.info(hour + " hours." + "It's night");

            return "night";
        }

        log.warn(hour + ". Undefined day period");

        return null;
    }

    public static void main(String[] args){
        sayHello();
    }
}
