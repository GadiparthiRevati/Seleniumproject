package crossBrowser;

import org.testng.annotations.Test;

public class Test2 extends BaseClass {
	@Test
	public void fbTest() {
		driver.get("https://www.facebook.com/");
	}

}
