package COM.KOTAKPFMS.QA.UTIL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author -- Suvarna Prabhumatkari
 **/
public class ConfigReader {

	public Properties prop;

	public Properties init_prop() {

		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}
}
