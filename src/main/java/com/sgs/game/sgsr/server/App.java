package com.sgs.game.sgsr.server;

import org.apache.commons.csv.CSVRecord;

import com.sgs.game.sgsr.server.utils.FileUtil;
import com.sgs.game.sgsr.server.utils.TimeUtil;
import com.sgs.game.sgsr.server.utils.config.Constants.ENV;
import com.sgs.game.sgsr.server.utils.config.Environment;
import com.sgs.game.sgsr.server.utils.db.StaticDBUtil;

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
		StaticDBUtil.downloadDataFirstTime();
	}

	public static void main(String[] agrs) {

		init();
	}
}
