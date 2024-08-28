package ht.dataStructures;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

//Demonstrates class Properties of the java.util package.
public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties table = new Properties(); // create properties table
		
		// set properties
		table.setProperty("color", "blue");
		table.setProperty("width", "200");
		
		System.out.println("After setting properties");
		listProperties(table); // display properties values
		
		// replace properties value
		table.setProperty("color", "red");
		
		System.out.println("After replacing properties");
		listProperties(table); // display properties values
		
		saveProperties(table); // save properties
		
		table.clear(); // empty table
		System.out.println("After clearing properties");
		listProperties(table); // display property values
		
		loadProperties( table ); // load properties 
		
		// get value of property color
		Object value = table.getProperty("color");
		
		// check if value is in table
		if(value != null)
			System.out.printf("Property colors value is %s\n", value);
		else
			System.out.println("property color is  not in table");
	
		
	}
	
	// save properties to a file
	private static void saveProperties(Properties props) {
		// save contents of table
		try {
			FileOutputStream output = new FileOutputStream("props.txt");
			props.store(output, "sample properties") ; // save properties
			output.close();
			System.out.println("After saving properties");
			listProperties(props); // display property values
		} catch(IOException ioException) {
			ioException.printStackTrace();
		}
	}
	
	// load properties from file
	private static void loadProperties(Properties props) {
		// load contents of table
		try {
			FileInputStream input = new FileInputStream("props.dat");
			props.load(input); ; // load properties
			input.close();
			System.out.println("After loading properties");
			listProperties(props); // display property values
		} catch(IOException ioException) {
			ioException.printStackTrace();
		}
			
		
	}
	
	// output property values
	private static void listProperties(Properties props) {
		Set<Object> keys = props.keySet(); // get property names
		
		// output name/value pairs
		for(Object key : keys)
			System.out.printf("%s\t%s\n", key, props.getProperty((String) key));
			
		System.out.println();
		
	}

}
