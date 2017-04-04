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

public class FileUtil {
	public static void init() {

	}

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
}
