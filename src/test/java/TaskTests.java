
import org.junit.Test;
import java.util.Locale;
import java.util.MissingResourceException;

import static org.junit.Assert.assertEquals;


public class TaskTests {

    @Test(expected=MissingResourceException.class)
    public void getMessageTest1(){
        Task.getMessage("wrong_basename", "morning", new Locale("en"));

    }

    @Test(expected=MissingResourceException.class)
    public void getMessageTest2(){
        Task.getMessage("msg", "wrong_word", new Locale("en"));
    }

    @Test
    public void getMessageFromNonexistentLocaleTest3(){
        Task.getMessage("msg", "morning", new Locale("ua"));
    }

    @Test
    public void convertToMessageKeyTest(){
        assertEquals("morning", Task.convertToMessageKey(DayPeriod.MORNING));
        assertEquals("day", Task.convertToMessageKey(DayPeriod.DAY));
        assertEquals("evening", Task.convertToMessageKey(DayPeriod.EVENING));
        assertEquals("night", Task.convertToMessageKey(DayPeriod.NIGHT));
    }

    @Test
    public void sayHelloTest(){
        Task.sayHello();
    }

}
