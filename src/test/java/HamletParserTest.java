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
    }

    @Test
    public void testChangeHoratioToTariq() {
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
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