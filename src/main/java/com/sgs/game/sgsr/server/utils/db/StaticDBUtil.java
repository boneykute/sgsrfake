/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.activation.FileTypeMap;

import org.apache.commons.csv.CSVRecord;

import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;
import com.sgs.game.sgsr.server.utils.FileUtil;

/**
 * The Class StaticDBUtil.
 */
public class StaticDBUtil {

	// region FIELD

	/** The static data. */
	private static HashMap<String, HashMap<String, List<BaseStaticDataDTO>>> staticData;

	/** The static data config. */
	private static HashMap<String, String> staticDataConfig;

	/** The Constant REMOTE_VERSION_FILE_URL. */
	private static final String REMOTE_VERSION_FILE_URL = "http://download1481.mediafireuserdownload.com/o87tjm789kqg/dvuci0hdikl0c5x/version.csv";

	/** The Constant REMOTE_VERSION_FILE_URL. */
	private static final String REMOTE_MAPPING_FILE_URL = "http://download1481.mediafireuserdownload.com/o87tjm789kqg/dvuci0hdikl0c5x/version.csv";

	/** The Constant LOCAL_BASE_PATH. */
	private static final String LOCAL_BASE_PATH = "data/static/";

	/** The Constant LOCAL_VERSION_FILE_PATH. */
	private static final String LOCAL_VERSION_FILE_PATH = LOCAL_BASE_PATH + "version.csv";

	/** Mapping file data parsed */
	private static HashMap<String, String> MAPPING_FILE_DATA = new HashMap<>();

	private static File versionFile;

	private static File mappingFile;

	// endregion FIELD

	/**
	 * Init stuff.
	 */
	public static void init() {
		setStaticDataConfig(new HashMap<>());
		setStaticData(new HashMap<>());

		downloadVersionFile();

		downloadDataFirstTime();
	}

	private static void parseMappingFile() {
		Iterable<CSVRecord> records = FileUtil.readCSVFile("");
		records.forEach(record -> MAPPING_FILE_DATA.put(record.get("File"), record.get("Url")));
	}

	// region FETCH DATA FROM FILE

	/**
	 * Fetch data from file.
	 *
	 * @param changedFile
	 *            the changed file
	 */
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

	/**
	 * Process version record.
	 *
	 * @param record
	 *            the record
	 * @param previousKey
	 *            the previous key
	 */
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
				File changedFile = FileUtil.download(changedFileName, LOCAL_BASE_PATH + changedFileName);
				fetchDataFromFile(changedFile);
			}
		}
	}

	private static void downloadVersionFile() {
		versionFile = FileUtil.download(REMOTE_VERSION_FILE_URL, LOCAL_VERSION_FILE_PATH);
	}

	/**
	 * Fetch version data from file.
	 */
	private static void fetchVersionDataFromFile() {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(LOCAL_VERSION_FILE_PATH);
		String previousKey = "";
		Iterator<CSVRecord> recordsIterator = records.iterator();
		while (recordsIterator.hasNext()) {
			CSVRecord record = recordsIterator.next();
			processVersionRecord(record, previousKey);
			previousKey = record.get("Client") + "-" + record.get("Data");
			System.out.println(previousKey);
		}
	}

	/**
	 * Fetch rune data from file.
	 *
	 * @param changedFile
	 *            the changed file
	 */
	private static void fetchRuneDataFromFile(File changedFile) {
		// TODO Auto-generated method stub
	}

	/**
	 * Fetch building data from file.
	 *
	 * @param changedFile
	 *            the changed file
	 */
	private static void fetchBuildingDataFromFile(File changedFile) {
		// TODO Auto-generated method stub
	}

	// endregion FETCH DATA FROM FILE

	// region UTILITY FUNCTION

	/**
	 * Gets the file name without extension.
	 *
	 * @param fileName
	 *            the file name
	 * @return the file name without extension
	 */
	private static String getFileNameWithoutExtension(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	/**
	 * Gets the data file type.
	 *
	 * @param fileName
	 *            the file name
	 * @return the data file type
	 */
	private static DataFileType getDataFileType(final String fileName) {
		return DataFileType.Character;
	}

	/**
	 * Download data first time.
	 */
	public static void downloadDataFirstTime() {
		Iterable<CSVRecord> versionsData = FileUtil.readCSVFile(LOCAL_VERSION_FILE_PATH);
		for (CSVRecord version : versionsData) {
			String versionName = version.get("Version");
			// TODO: Create folder with version name
			String versionMappingFilePath = LOCAL_BASE_PATH + "/" + versionName + "/mapping.csv";
			File mappingFile = FileUtil.download(version.get("Url"), versionMappingFilePath);
			Iterable<CSVRecord> mappingData = FileUtil.readCSVFile(versionMappingFilePath);
			for (CSVRecord mappingItem : mappingData) {
				String fileName = mappingItem.get("File");
				String filePath = LOCAL_BASE_PATH + "/" + versionName + "/" + fileName;
				FileUtil.download(mappingItem.get("Url"), filePath);
			}
		}
	}

	/**
	 * Download data update.
	 */
	public static void downloadDataUpdate() {

	}

	// endregion UTILITY FUNCTION

	// region GETTER AND SETTER

	/**
	 * Gets the static data.
	 *
	 * @return the static data
	 */
	public static HashMap<String, HashMap<String, List<BaseStaticDataDTO>>> getStaticData() {
		return staticData;
	}

	/**
	 * Sets the static data.
	 *
	 * @param staticData
	 *            the static data
	 */
	public static void setStaticData(HashMap<String, HashMap<String, List<BaseStaticDataDTO>>> staticData) {
		StaticDBUtil.staticData = staticData;
	}

	/**
	 * Gets the static data configuration.
	 *
	 * @return the static data configuration
	 */
	public static HashMap<String, String> getStaticDataConfig() {
		return staticDataConfig;
	}

	/**
	 * Sets the static data config.
	 *
	 * @param staticDataConfig
	 *            the static data config
	 */
	public static void setStaticDataConfig(HashMap<String, String> staticDataConfig) {
		StaticDBUtil.staticDataConfig = staticDataConfig;
	}

	// endregion GETTER AND SETTER
}
