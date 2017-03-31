package com.sgs.game.sgsr.server;

import com.sgs.game.sgsr.server.utils.config.Environment;
import com.sgs.game.sgsr.server.utils.config.Constants.ENV;

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

	public static void main(String[] agrs) {
		App app = new App();
		new Environment(app.getEnvironment());
		
		// Do more stuff
	}
}
