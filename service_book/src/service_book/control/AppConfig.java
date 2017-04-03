package service_book.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

import service_book.Book;

public class AppConfig {

	public static File file = new File("resources/config.properties");
	public static Enumeration enuKeys;
	public static Properties properties = new Properties();
	
	public static int readConf()
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
//			ex.printStackTrace();
			return(Book.COMMONERROR);
		} catch (IOException e) {
//			e.printStackTrace();
			return(Book.COMMONERROR);
		}
		return(0);
	}
	
//	ZAPISYWANIE DO PLICZKU:)
	public static int saveConf()
	{
		Date time = new Date(System.currentTimeMillis());
		try {
			FileOutputStream fileOut = new FileOutputStream(file);		
			properties.store(fileOut, time.toString());
			fileOut.close();
		} catch (FileNotFoundException ex) {
//			ex.printStackTrace();
			return(Book.COMMONERROR);
		} catch (IOException e) {
//			e.printStackTrace();
			return(Book.COMMONERROR);
		}
		return(0);
	}
		
	
	
}
