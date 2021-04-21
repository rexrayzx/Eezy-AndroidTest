package ai.eezy.generics;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtil {
	/**
	 * To get the data from property file
	 * @param key
	 * @return String
	 * @throws Throwable
	 */
	public String getDataFromPropertFile(String key) throws Throwable{
		Properties p= new Properties();
		p.load(new FileInputStream(PathConstant.filePath));
		return p.getProperty(key);
	}
}
