/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server;

import com.sgs.game.sgsr.server.utils.FileUtil;
import com.sgs.game.sgsr.server.utils.TimeUtil;
import com.sgs.game.sgsr.server.utils.config.Constants.ENVIRONMENT;
import com.sgs.game.sgsr.server.utils.config.Environment;
import com.sgs.game.sgsr.server.utils.db.staticdata.StaticDBUtil;

/**
 * The Class App.
 */
public class App {

	/** The environment. */
	// Change this to switch environment
	private ENVIRONMENT environment;

	/**
	 * Instantiates a new app.
	 */
	public App() {
		environment = ENVIRONMENT.DEV;
	}

	/**
	 * Instantiates a new app.
	 *
	 * @param ENVIRONMENT
	 *            the environment
	 */
	public App(ENVIRONMENT ENVIRONMENT) {
		environment = ENVIRONMENT;
	}

	/**
	 * Gets the environment.
	 *
	 * @return the environment
	 */
	public ENVIRONMENT getEnvironment() {
		return environment;
	}

	/**
	 * Sets the environment.
	 *
	 * @param ENVIRONMENT
	 *            the new environment
	 */
	public void setEnvironment(ENVIRONMENT ENVIRONMENT) {
		environment = ENVIRONMENT;
	}

	/**
	 * Init stuff.
	 */
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

	/**
	 * The main method.
	 *
	 * @param agrs
	 *            the arguments
	 */
	public static void main(String[] agrs) {

		init();
	}
}
