/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;
import com.sgs.game.sgsr.server.utils.FileUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticDBUtil.
 */
public class StaticDBUtil {

	// region FIELD

	/** The static data. */
	@SuppressWarnings("rawtypes")
	private static HashMap<String, HashMap<String, HashMap<Integer, BaseStaticDataDTO>>> staticData;

	/** The static data config. */
	private static HashMap<String, String> staticDataConfig;

	/** The Constant REMOTE_VERSION_FILE_URL. */
	private static String REMOTE_VERSION_FILE_URL = "http://download1481.mediafireuserdownload.com/o87tjm789kqg/dvuci0hdikl0c5x/version.csv";

	/** The Constant LOCAL_BASE_PATH. */
	private static String LOCAL_BASE_PATH = "data/prod/static/";

	/** The Constant LOCAL_VERSION_FILE_PATH. */
	private static String LOCAL_VERSION_FILE_PATH = LOCAL_BASE_PATH + "version.csv";

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
	public static void fetchDataFirstTime() {
		File localStaticDataDirectory = new File(LOCAL_BASE_PATH);
		String[] extensions = new String[] { "csv" };
		File[] versionFolders = localStaticDataDirectory.listFiles((FileFilter) DirectoryFileFilter.DIRECTORY);
		for (File versionFolder : versionFolders) {
			staticData.put(versionFolder.getName(), new HashMap<>());
			Collection<File> files = FileUtils.listFiles(versionFolder, extensions, true);
			files.forEach(file -> FetchDataFromFile.fetch(versionFolder.getName(), file));
			// Create DAO
		}
	}

	/**
	 * Download version file.
	 */
	public static void downloadVersionFile() {
		setVersionFile(FileUtil.download(REMOTE_VERSION_FILE_URL, LOCAL_VERSION_FILE_PATH));
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

	// endregion UPDATE DATA IN RUNTIME

	// region GETTER AND SETTER

	/**
	 * Gets the static data.
	 *
	 * @return the static data
	 */
	@SuppressWarnings("rawtypes")
	public static HashMap<String, HashMap<String, HashMap<Integer, BaseStaticDataDTO>>> getStaticData() {
		return staticData;
	}

	/**
	 * Sets the static data.
	 *
	 * @param staticData
	 *            the static data
	 */
	@SuppressWarnings("rawtypes")
	public static void setStaticData(HashMap<String, HashMap<String, HashMap<Integer, BaseStaticDataDTO>>> staticData) {
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

	/**
	 * Gets the version file.
	 *
	 * @return the version file
	 */
	public static File getVersionFile() {
		return versionFile;
	}

	/**
	 * Sets the version file.
	 *
	 * @param versionFile
	 *            the new version file
	 */
	public static void setVersionFile(File versionFile) {
		StaticDBUtil.versionFile = versionFile;
	}

	/**
	 * Gets the remote version file url.
	 *
	 * @return the remote version file url
	 */
	public static String getREMOTE_VERSION_FILE_URL() {
		return REMOTE_VERSION_FILE_URL;
	}

	/**
	 * Sets the remote version file url.
	 *
	 * @param rEMOTE_VERSION_FILE_URL
	 *            the new remote version file url
	 */
	public static void setREMOTE_VERSION_FILE_URL(String rEMOTE_VERSION_FILE_URL) {
		REMOTE_VERSION_FILE_URL = rEMOTE_VERSION_FILE_URL;
	}

	/**
	 * Gets the local base path.
	 *
	 * @return the local base path
	 */
	public static String getLOCAL_BASE_PATH() {
		return LOCAL_BASE_PATH;
	}

	/**
	 * Sets the local base path.
	 *
	 * @param lOCAL_BASE_PATH
	 *            the new local base path
	 */
	public static void setLOCAL_BASE_PATH(String lOCAL_BASE_PATH) {
		LOCAL_BASE_PATH = lOCAL_BASE_PATH;
	}

	/**
	 * Gets the local version file path.
	 *
	 * @return the local version file path
	 */
	public static String getLOCAL_VERSION_FILE_PATH() {
		return LOCAL_VERSION_FILE_PATH;
	}

	/**
	 * Sets the local version file path.
	 *
	 * @param lOCAL_VERSION_FILE_PATH
	 *            the new local version file path
	 */
	public static void setLOCAL_VERSION_FILE_PATH(String lOCAL_VERSION_FILE_PATH) {
		LOCAL_VERSION_FILE_PATH = lOCAL_VERSION_FILE_PATH;
	}

	// endregion GETTER AND SETTER
}
