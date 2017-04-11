/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;

import com.sgs.game.sgsr.server.dto.staticdata.IBaseStaticDataDTO;
import com.sgs.game.sgsr.server.utils.FileUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticDBUtil.
 */
public class StaticDBUtil {

	// region FIELD

	/** The static data. */
	@SuppressWarnings("rawtypes")
	private static HashMap<String, HashMap<String, List<IBaseStaticDataDTO>>> staticData;

	/** The static data config. */
	private static HashMap<String, String> staticDataConfig;

	/** The Constant REMOTE_VERSION_FILE_URL. */
	private static final String REMOTE_VERSION_FILE_URL = "http://download1481.mediafireuserdownload.com/o87tjm789kqg/dvuci0hdikl0c5x/version.csv";

	/** The Constant LOCAL_BASE_PATH. */
	private static final String LOCAL_BASE_PATH = "data/static/";

	/** The Constant LOCAL_VERSION_FILE_PATH. */
	private static final String LOCAL_VERSION_FILE_PATH = LOCAL_BASE_PATH + "version.csv";

	/** The version file. */
	private static File versionFile;

	// endregion FIELD

	/**
	 * Init stuff.
	 */
	public static void init() {
		setStaticDataConfig(new HashMap<>());
		setStaticData(new HashMap<>());

		downloadVersionFile();

		downloadDataFirstTime();

		fetchDataFirstTime();
	}

	/**
	 * Fetch data first time.
	 */
	private static void fetchDataFirstTime() {
		File localDirectory = new File(LOCAL_BASE_PATH);
		String[] extensions = new String[] { "csv" };
		Collection<File> files = FileUtils.listFiles(localDirectory, extensions, true);
		files.forEach(file -> FetchDataFromFile.fetch(file));
	}

	/**
	 * Download version file.
	 */
	private static void downloadVersionFile() {
		versionFile = FileUtil.download(REMOTE_VERSION_FILE_URL, LOCAL_VERSION_FILE_PATH);
	}

	/**
	 * Read version file.
	 *
	 * @return the iterable
	 */
	private static Iterable<CSVRecord> readVersionFile() {
		return FileUtil.readCSVFile(LOCAL_VERSION_FILE_PATH);
	}

	/**
	 * Download data first time.
	 */
	public static void downloadDataFirstTime() {
		Iterable<CSVRecord> versionsData = readVersionFile();
		for (CSVRecord version : versionsData) {
			String versionName = version.get("Version");
			File versionFolder = new File(LOCAL_BASE_PATH + "/" + versionName);
			try {
				FileUtils.forceMkdir(versionFolder);
				String versionMappingFilePath = LOCAL_BASE_PATH + "/" + versionName + "/mapping.csv";
				FileUtil.download(version.get("Url"), versionMappingFilePath);
				Iterable<CSVRecord> mappingData = FileUtil.readCSVFile(versionMappingFilePath);
				for (CSVRecord mappingItem : mappingData) {
					String fileName = mappingItem.get("File");
					String filePath = LOCAL_BASE_PATH + "/" + versionName + "/" + fileName;
					FileUtil.download(mappingItem.get("Url"), filePath);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// region UPDATE DATA IN RUNTIME

	/**
	 * Download data update.
	 */
	public static void downloadDataUpdate() {

	}

	/**
	 * Process version record.
	 *
	 * @param record
	 *            the record
	 * @param previousKey
	 *            the previous key
	 */
	@SuppressWarnings("rawtypes")
	private static void processVersionRecord(CSVRecord record, String previousKey) {
		// Check if version existed in static data (check by client id)
		String key = record.get("Client") + "-" + record.get("Data");
		boolean isExisted = staticData.containsKey(key);

		if (!isExisted) {
			// Clone data from previous data
			HashMap<String, List<IBaseStaticDataDTO>> previousVerionStaticData = staticData.get(previousKey);
			staticData.put(key, previousVerionStaticData);

			// Download new static data depend on changed files
			String[] changedFiles = record.get("ChangedFiles").split(",");
			for (int i = 0; i < changedFiles.length; i++) {
				String changedFileName = changedFiles[i];
				File changedFile = FileUtil.download(changedFileName, LOCAL_BASE_PATH + changedFileName);
				FetchDataFromFile.fetch(changedFile);
			}
		}
	}

	/**
	 * Fetch version data from file.
	 */
	@SuppressWarnings("unused")
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

	// endregion UPDATE DATA IN RUNTIME

	// region GETTER AND SETTER

	/**
	 * Gets the static data.
	 *
	 * @return the static data
	 */
	@SuppressWarnings("rawtypes")
	public static HashMap<String, HashMap<String, List<IBaseStaticDataDTO>>> getStaticData() {
		return staticData;
	}

	/**
	 * Sets the static data.
	 *
	 * @param staticData
	 *            the static data
	 */
	@SuppressWarnings("rawtypes")
	public static void setStaticData(HashMap<String, HashMap<String, List<IBaseStaticDataDTO>>> staticData) {
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
