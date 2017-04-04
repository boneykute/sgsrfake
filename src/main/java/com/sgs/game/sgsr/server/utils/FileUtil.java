package com.sgs.game.sgsr.server.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class FileUtil {
	public static void init() {

	}

	public static void download(String fromUrl, String desUrl) {
		try {
			FileUtils.copyURLToFile(new URL(fromUrl), new File(desUrl), 1000, 5000);
			System.out.println("Downloaded: " + fromUrl + " to " + desUrl);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cannot download file: " + fromUrl + " to " + desUrl);
		}
	}
}
