package service_book.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class LoadConfig {

	public static File file = new File("resources/config.properties");
	public static Enumeration enuKeys;
	public static Properties properties = new Properties();
	
	public static void readConf()
	{
		try {
			FileInputStream fileInput = new FileInputStream(file);
			properties.load(fileInput);
			enuKeys = properties.keys();
//			while (enuKeys.hasMoreElements()) {
//				String key = (String) enuKeys.nextElement();
//				String value = properties.getProperty(key);
//				System.out.println(key + value);
//			}
			
			fileInput.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	ZAPISYWANIE DO PLICZKU:)
	public static void saveConf()
	{
		Date time = new Date(System.currentTimeMillis());
		try {
			FileOutputStream fileOut = new FileOutputStream(file);		
			properties.store(fileOut, time.toString());
			fileOut.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void 
	
	
	
}
