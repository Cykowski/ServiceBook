package service_book.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadConfig {

	
	public static void readConf()
	{
		
		try {
			File file = new File("resources/config.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			System.out.println("costam: " + properties.getProperty("testproperty"));
			fileInput.close();

//	ZAPISYWANIE DO PLICZKU:)
//			FileOutputStream fileOut = new FileOutputStream(file);
//			properties.setProperty("new", ";)")	;		
//			properties.store(fileOut, "no com");
//			fileOut.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
