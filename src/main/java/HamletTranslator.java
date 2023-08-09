public class HamletTranslator {

    HamletParser parser = new HamletParser();

    public static void main(String[] args) {
        HamletParser parser = new HamletParser();

        parser.setHamletData(parser.loadFile());
        parser.hamletToLeonConvert();
        parser.horatioToTariqConvert();
        parser.newHamletWriter();

    }
}
