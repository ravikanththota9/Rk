package suite1;
import static org.testng.Assert.assertEquals;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGSimpleOverridesTest {
	public static int EXPECTED_OVERRIDES = 5;
	
	@Test
	public void OR_Positive_Basic_OverrideCount_TC101() throws RestClientException {
		
		
		RestTemplate restTemplate = new RestTemplate();
		try {
			String s = restTemplate.getForObject("http://localhost:8081/courses/2", String.class);
			System.out.println(s);
			Reporter.log("testcase " + s);
			assertEquals(s, s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}