package com.sgs.game.sgsr.server.utils.db;

import java.io.File;
import java.util.HashMap;

import com.sgs.game.sgsr.server.utils.FileUtil;

public class StaticDBUtil {
	private static HashMap<String, String> staticData;
	private static HashMap<String, String> staticDataConfig;
	
	private static final String REMOTE_BASE_URL = "http://download947.mediafireuserdownload.com/";
	private static final String REMOTE_VERSION_FILE_URL = REMOTE_BASE_URL + "version.csv";
	
	private static final String LOCAL_BASE_PATH = "data/static";
	private static final String LOCAL_VERSION_FILE_PATH = LOCAL_BASE_PATH + "version.csv";
	
	
	public static void init() {
		setStaticDataConfig(new HashMap<>());
		setStaticData(new HashMap<>());
		
//		staticData.put(baseUrl + "mm2j3sirgztg/s4rsabkj1k36t4a/Character-NinjaSecretary.csv", "Character-NinjaSecretary.csv");
//		staticData.put(baseUrl + "qwer1chb1sgg/7l50gzoq19wt4w6/Character-Pigtank.csv", "Character-Pigtank.csv");
	}
	
	private static void loadVersion() {
		File versionFile = FileUtil.download(REMOTE_VERSION_FILE_URL, LOCAL_VERSION_FILE_PATH);
	}
	
	public static void downloadData() {
		staticData.forEach((fromUrl, desUrl) -> FileUtil.download(fromUrl, desUrl));
	}

	public static HashMap<String, String> getStaticData() {
		return staticData;
	}

	public static void setStaticData(HashMap<String, String> staticData) {
		StaticDBUtil.staticData = staticData;
	}

	public static HashMap<String, String> getStaticDataConfig() {
		return staticDataConfig;
	}

	public static void setStaticDataConfig(HashMap<String, String> staticDataConfig) {
		StaticDBUtil.staticDataConfig = staticDataConfig;
	}
}
