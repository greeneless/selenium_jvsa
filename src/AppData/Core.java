package AppData;
import org.ini4j.Wini;
import java.io.File;

public class Core {
    public static String IniGet (String pathName, String section, String option) {
        String dataOut = "No data";
        try {
            Wini appSettings = new Wini(new File(pathName));

            dataOut = appSettings.get(section, option).toString();
            if (dataOut.equals(null)) {
                System.err.println("appSettings.Common.Work_Cfg is null");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return dataOut;
    }
}
