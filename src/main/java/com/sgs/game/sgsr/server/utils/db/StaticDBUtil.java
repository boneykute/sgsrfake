package com.sgs.game.sgsr.server.utils.db;

import java.util.HashMap;

import com.sgs.game.sgsr.server.utils.FileUtil;

public class StaticDBUtil {
	private static HashMap<String, String> staticDataFiles;
	private static final String baseUrl = "http://download947.mediafireuserdownload.com/";
	public static void init() {
		setStaticDataFiles(new HashMap<>());
		staticDataFiles.put(baseUrl + "mm2j3sirgztg/s4rsabkj1k36t4a/Character-NinjaSecretary.csv", "Character-NinjaSecretary.csv");
		staticDataFiles.put(baseUrl + "qwer1chb1sgg/7l50gzoq19wt4w6/Character-Pigtank.csv", "Character-Pigtank.csv");
	}
	
	
	public static void downloadData() {
		staticDataFiles.forEach((fromUrl, desUrl) -> FileUtil.download(fromUrl, desUrl));
	}

	public static HashMap<String, String> getStaticDataFiles() {
		return staticDataFiles;
	}

	public static void setStaticDataFiles(HashMap<String, String> hashMap) {
		StaticDBUtil.staticDataFiles = hashMap;
	}
}
