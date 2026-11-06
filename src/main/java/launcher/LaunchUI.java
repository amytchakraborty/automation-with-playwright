package launcher;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchUI {
	
	private static String url = "https://www.google.com/";


	public void launch(String urls) {
		try {
			url = urls != null? urls: url;
			
			Playwright playwright = Playwright.create();
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			Page page = browser.newPage();
			page.navigate(url);	
			
			Thread.sleep(5000);
			page.close();
			playwright.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
