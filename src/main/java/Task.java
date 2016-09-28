import org.apache.log4j.Logger;

import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class Task {

    private static final Logger log = Logger.getLogger(Task.class);

    /**
     *
     * @param res
     * @param key
     * @param locale
     * @return appropriate message
     */
    public static String getMessage(final String res, final String key, final Locale locale){
        log.info("Trying to get needed string from resource bundle...");
        log.info("Basename: " + res + ". Key word: " + key + ". Locale: " + locale);
        ResourceBundle bundle = ResourceBundle.getBundle(res, locale);
        return bundle.getString(key);
    }

    /**
     * util to define the key word in resource bundle that corresponds current day period
     * @param period
     * @return correct key word stored in resource bundle
     */
    public static String convertToMessageKey(DayPeriod period){
        return period.toString().toLowerCase();
    }

    public static void sayHello(){

        //getting user time now
        LocalTime localTime = LocalTime.now();

        log.info("Current local time: " + localTime);

        //getting user locale now
        final int currentHour = LocalTime.now().getHour();

        log.info("Hour: " + currentHour);

        //find out the day period now
        DayPeriod dayPeriod = DayUtils.getDayPeriodByHour(currentHour);

        if (dayPeriod == null) {
            log.error("DayPeriod is null !");
            return;
        }else{
            log.info("Current day period now: " + dayPeriod + "("+dayPeriod.timePeriod()+")");
        }

        //getting appropriate message from resource bundle
        System.out.println(getMessage("msg", convertToMessageKey(dayPeriod), Locale.getDefault()));
    }

    public static void main(String[] args){

            sayHello();
    }
}
