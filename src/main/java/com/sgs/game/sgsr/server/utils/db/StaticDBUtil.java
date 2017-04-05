package com.sgs.game.sgsr.server.utils.db;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.csv.CSVRecord;

import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;
import com.sgs.game.sgsr.server.utils.FileUtil;

public class StaticDBUtil {

	// region FIELD
	private static HashMap<String, HashMap<String, List<BaseStaticDataDTO>>> staticData;
	private static HashMap<String, String> staticDataConfig;

	private static final String REMOTE_BASE_URL = "http://download947.mediafireuserdownload.com/";
	private static final String REMOTE_VERSION_FILE_URL = REMOTE_BASE_URL + "version.csv";

	private static final String LOCAL_BASE_PATH = "data/static/";
	private static final String LOCAL_VERSION_FILE_PATH = LOCAL_BASE_PATH + "version.csv";

	// endregion FIELD

	public static void init() {
		setStaticDataConfig(new HashMap<>());
		setStaticData(new HashMap<>());
		downloadDataFirstTime();
	}

	// region FETCH DATA FROM FILE
	private static void fetchDataFromFile(File changedFile) {
		// Get filename without extension to check
		String fileNameWithoutExtension = getFileNameWithoutExtension(changedFile.getName());
		// Find data file type
		DataFileType dataFileType = getDataFileType(fileNameWithoutExtension);
		// Update static data
		switch (dataFileType) {
		case Building:
			fetchBuildingDataFromFile(changedFile);
			break;
		case Rune:
			fetchRuneDataFromFile(changedFile);
			break;
		case Character:
			break;
		case Chest:
			break;
		case Pack:
			break;
		default:
			break;
		}
	}

	private static void processVersionRecord(CSVRecord record, String previousKey) {
		// Check if version existed in static data (check by client id)
		String key = record.get("Client") + "-" + record.get("Data");
		boolean isExisted = staticData.containsKey(key);

		if (!isExisted) {
			// Clone data from previous data
			HashMap<String, List<BaseStaticDataDTO>> previousVerionStaticData = staticData.get(previousKey);
			staticData.put(key, previousVerionStaticData);

			// Download new static data depend on changed files
			String[] changedFiles = record.get("ChangedFiles").split(",");
			for (int i = 0; i < changedFiles.length; i++) {
				String changedFileName = changedFiles[i];
				File changedFile = FileUtil.download(REMOTE_BASE_URL + changedFileName,
						LOCAL_BASE_PATH + changedFileName);
				fetchDataFromFile(changedFile);
			}
		}
	}

	private static void fetchVersionDataFromFile() {
		//FileUtil.download(REMOTE_VERSION_FILE_URL, LOCAL_VERSION_FILE_PATH);
		Iterable<CSVRecord> records = FileUtil.readCSVFile(LOCAL_VERSION_FILE_PATH);
		String previousKey = "";
		while (records.iterator().hasNext()) {
			CSVRecord record = records.iterator().next();
			processVersionRecord(record, previousKey);
			previousKey = record.get("Client") + "-" + record.get("Data");
		}
	}

	private static void fetchRuneDataFromFile(File changedFile) {
		// TODO Auto-generated method stub
	}

	private static void fetchBuildingDataFromFile(File changedFile) {
		// TODO Auto-generated method stub
	}
	// endregion FETCH DATA FROM FILE

	// region UTILITY FUNCTION
	private static String getFileNameWithoutExtension(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	private static DataFileType getDataFileType(final String fileName) {
		return DataFileType.Character;
	}

	public static void downloadData(boolean isFirstTime) {

	}

	public static void downloadDataFirstTime() {
		downloadData(true);
	}

	public static void downloadDataUpdate() {
		downloadData(false);
	}
	// endregion UTILITY FUNCTION

	// region GETTER AND SETTER
	public static HashMap<String, HashMap<String, List<BaseStaticDataDTO>>> getStaticData() {
		return staticData;
	}

	public static void setStaticData(HashMap<String, HashMap<String, List<BaseStaticDataDTO>>> staticData) {
		StaticDBUtil.staticData = staticData;
	}

	public static HashMap<String, String> getStaticDataConfig() {
		return staticDataConfig;
	}

	public static void setStaticDataConfig(HashMap<String, String> staticDataConfig) {
		StaticDBUtil.staticDataConfig = staticDataConfig;
	}
	// endregion GETTER AND SETTER
}
