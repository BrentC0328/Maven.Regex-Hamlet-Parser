import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        HamletParser parser = new HamletParser();
        String testString = "hamlET Eight Nine HAMLET Eight Nine Hamlet Eight Nine";
        parser.setHamletData(testString);
        String expected = "Leon Eight Nine Leon Eight Nine Leon Eight Nine";
        parser.hamletToLeonConvert();
        String actual = parser.getHamletData();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        HamletParser parser = new HamletParser();
        String testString = "HORATIO Eight Nine horatio Eight Nine HoraTIO Eight Nine";
        parser.setHamletData(testString);
        String expected = "Tariq Eight Nine Tariq Eight Nine Tariq Eight Nine";
        parser.horatioToTariqConvert();
        String actual = parser.getHamletData();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void textMatchAndReplacer() {
        HamletParser parser = new HamletParser();
        String testString = "seven Eight Nine SEVEN Eight Nine SevEn Eight Nine";
        parser.setHamletData(testString);
        String expected = "1 Eight Nine 1 Eight Nine 1 Eight Nine";

        String actual = parser.textMatchAndReplacer("Seven", "1");

        Assert.assertEquals(expected, actual);
    }
}