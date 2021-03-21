package newtwo.tool;

import panda.mvc.MvcConsole;

import newtwo.WebSetup;

public class AppConsole extends MvcConsole {
	private static AppConsole INSTANCE;
	
	public static synchronized AppConsole i() {
		if (INSTANCE == null) {
			INSTANCE = new AppConsole();
		}
		return INSTANCE;
	}

	public AppConsole() {
		super(WebSetup.class, "web");
	}
}
