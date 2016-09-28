import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

public class LocaleResBundleTests {

    @Test
    public void LocaleMsgEnTest(){
        ResourceBundle bundle = ResourceBundle.getBundle("msg", new Locale("en"));

        assertEquals("Good morning, World!", bundle.getString("morning"));
        assertEquals("Good day, World!", bundle.getString("day"));
        assertEquals("Good evening, World!", bundle.getString("evening"));
        assertEquals("Good night, World!", bundle.getString("night"));
    }

    @Test
    public void LocaleMsgRuTest(){

        ResourceBundle bundle = ResourceBundle.getBundle("msg", new Locale("ru"));

        assertEquals("Доброе утро, Мир!", bundle.getString("morning"));
        assertEquals("Доброй день, Мир!", bundle.getString("day"));
        assertEquals("Доброй вечер, Мир!", bundle.getString("evening"));
        assertEquals("Доброй ночи, Мир!", bundle.getString("night"));

    }

}
