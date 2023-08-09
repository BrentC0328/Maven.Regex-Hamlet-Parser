import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    public String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");



        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public void setHamletData(String hamletData) {
        this.hamletData = hamletData;
    }
    public String getHamletData(){
        return hamletData;
    }


    public String textMatchAndReplacer(String regexToFind, String replacement){
        Pattern pattern = Pattern.compile(regexToFind, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(hamletData); //maybe call loadFile()?
        return matcher.replaceAll(replacement);

    }
    public void hamletToLeonConvert(){
        this.hamletData = textMatchAndReplacer("Hamlet", "Leon");
    }

    public void horatioToTariqConvert(){
        this.hamletData = textMatchAndReplacer("Horatio", "Tariq");
    }

    public void newHamletWriter(){
        try {
            FileWriter fileWriter = new FileWriter("newHamlet.txt");

            Scanner scanner = new Scanner(hamletData);

            while (scanner.hasNextLine()){
                String nextLine = scanner.nextLine();
                fileWriter.write(nextLine + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
