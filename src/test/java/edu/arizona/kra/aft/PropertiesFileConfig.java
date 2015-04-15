package edu.arizona.kra.aft;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileConfig implements Configurable {
	private Properties configProps;
	
	private static final String URL_PROPERTY = "application.url";
	private static final String USER_HOME_PROPERTY = "user.home";
	private static final String CAS_USERNAME_PROPERTY = "cas.username";
	private static final String CAS_PASSWORD_PROPERTY = "cas.password";
	
	private static final String CONFIG_FILE_PATH_PROPERTY = "kc.aft.config.path";
	private static final String CONFIG_FILE_NAME = "KCAutomatedFuntionalTest.properties";
	
	public PropertiesFileConfig() throws IOException {
		configProps = initConfigProps();
	}

	public String getApplicationUrl() {
		return configProps.getProperty(URL_PROPERTY);
	}

	public String getCasUsername() {
		return configProps.getProperty(CAS_USERNAME_PROPERTY);
	}

	public String getCasPassword() {
		return configProps.getProperty(CAS_PASSWORD_PROPERTY);
	}
	
	private Properties initConfigProps() throws FileNotFoundException {
		
		Properties prop = new Properties();
		String configFileName = getConfigFile();
		
		FileInputStream inputStream = new FileInputStream(configFileName);
		
		
		if ( inputStream != null ) {
			try {
				prop.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			throw new FileNotFoundException("property file '" + configFileName + "' not found in the classpath");
		}
		
		return prop;
	}
	
	private String getConfigFile() {
		String configFilePath = System.getProperty(CONFIG_FILE_PATH_PROPERTY, null);
		
		if ( configFilePath == null ) {
			configFilePath = System.getProperty(USER_HOME_PROPERTY);
		}
		
		String configFile = configFilePath + System.getProperty("file.separator") + CONFIG_FILE_NAME;
		
		return configFile;
	}
}
