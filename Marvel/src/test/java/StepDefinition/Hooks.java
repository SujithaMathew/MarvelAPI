package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void commonStep() {
		
		launchBrowser();
		max();
		loadUrl("https://www.marvel.com");
		
		
	}
	
	@After
	public void quit() {
		close();
	}
}
