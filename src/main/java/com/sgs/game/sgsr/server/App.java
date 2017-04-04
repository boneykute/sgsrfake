package com.sgs.game.sgsr.server;

import com.sgs.game.sgsr.server.utils.FileUtil;
import com.sgs.game.sgsr.server.utils.TimeUtil;
import com.sgs.game.sgsr.server.utils.config.Environment;

import org.apache.commons.csv.CSVRecord;

import com.sgs.game.sgsr.server.extentions.SGSRExtension;
import com.sgs.game.sgsr.server.utils.config.Constants.ENV;
import com.sgs.game.sgsr.server.utils.db.DynamicDBUtil;
import com.sgs.game.sgsr.server.utils.db.StaticDBUtil;
import com.smartfoxserver.v2.controllers.system.buddylist.InitBuddyList;

public class App {
	// Change this to switch environment
	private ENV environment;

	public App() {
		environment = ENV.DEV;
	}

	public App(ENV env) {
		environment = env;
	}

	public ENV getEnvironment() {
		return environment;
	}

	public void setEnvironment(ENV env) {
		environment = env;
	}

	private static void init() {
		App app = new App();
		new Environment(app.getEnvironment());

		// Init helper
		FileUtil.init();
		TimeUtil.init();

		StaticDBUtil.init();

		// Download static data
		StaticDBUtil.downloadData();
	}

	public static void main(String[] agrs) {

		init();

		// TODO: remove in production, just test here
		Iterable<CSVRecord> records = FileUtil.readCSVFile("staticdatafiles/version.csv");
		records.forEach(record -> System.out.println(record.get("Client") + ", " + record.get(1) + ", " + record.get(2)));
	}
}
