package I18N;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		
	//	final String FILE = "AutomateWaveClose.src.I18N.wish.properties";
		
		//Loaded properties file based on current locale
	//	ResourceBundle rb = ResourceBundle.getBundle("wish", new Locale(Locale.FRENCH));
		
		//Loaded properties file based on passes locale
		ResourceBundle rbf = ResourceBundle.getBundle("wish", Locale.FRENCH);
		
		System.out.println(rbf);
		printMessages(rbf);
		
	}
	
		private static void printMessages(ResourceBundle rbf) {
	        System.out.println(rbf.getString("hellowish"));
	    }
	}


