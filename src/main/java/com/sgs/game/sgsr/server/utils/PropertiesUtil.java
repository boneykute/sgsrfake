package com.sgs.game.sgsr.server.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.commons.collections.map.HashedMap;

public class PropertiesUtil {

	public static Properties read(ClassLoader classLoader, String file) {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = classLoader.getResourceAsStream(file);
			// load a properties file
			prop.load(input);
			return prop;
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static void write(String file, HashedMap data) {
		Properties prop = new Properties();
		OutputStream output = null;

		try {
			output = new FileOutputStream(file);
			prop.putAll(data);
			// save properties to project root folder
			prop.store(output, null);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String propertiesToString(Properties prop) {
		String str = "";
		for (String key : prop.stringPropertyNames()) {
			String value = prop.getProperty(key);
			str += (key + " => " + value);
		}
		return str;
	}
}
