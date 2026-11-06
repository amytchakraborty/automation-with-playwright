package playwright.runner;

import launcher.LaunchUI;

public class TestRunner {
	

	
	public static void main (String [] args) {
		System.out.println("Welcome!");
		
		LaunchUI ui = new LaunchUI();
		ui.launch(null);
		ui.launch("https://www.facebook.com/");
	}
}
