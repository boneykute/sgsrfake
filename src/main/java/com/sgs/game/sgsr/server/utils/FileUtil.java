/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class FileUtil.
 */
public class FileUtil {

	/**
	 * Inits the.
	 */
	public static void init() {

	}

	/**
	 * Download.
	 *
	 * @param fromUrl
	 *            the from url
	 * @param desUrl
	 *            the des url
	 * @return the file
	 */
	public static File download(String fromUrl, String desUrl) {
		try {
			URL url = new URL(fromUrl);
			File file = new File(desUrl);
			FileUtils.copyURLToFile(url, file, 1000, 5000);
			System.out.println("Downloaded: " + fromUrl + " to " + desUrl);
			return file;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cannot download file: " + fromUrl + " to " + desUrl);
		}
		return null;
	}

	/**
	 * Read CSV file.
	 *
	 * @param fileUrl
	 *            the file url
	 * @return the iterable
	 */
	public static Iterable<CSVRecord> readCSVFile(String fileUrl) {
		Reader in;
		try {
			in = new FileReader(fileUrl);
			Iterable<CSVRecord> records;
			try {
				records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
				return records;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Gets the file name without extension.
	 *
	 * @param fileName
	 *            the file name
	 * @return the file name without extension
	 */
	public static String getFileNameWithoutExtension(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	/**
	 * Gets the file name without extension.
	 *
	 * @param file
	 *            the file
	 * @return the file name without extension
	 */
	public static String getFileNameWithoutExtension(File file) {
		return getFileNameWithoutExtension(file.getName());
	}
}
