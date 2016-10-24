package suite2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSimpleDataloadTest {
	
	public static int EXPECTED_NULL_ROWS_COUNT = 3;
	public static int EXPECTED_REJECTED_ROWS = 0;
	public static int EXPECTED_NUMERIC_REJECT_ROWS_COUNT = 4;
	
	@Test(groups = { "dt.positive"})
	public void DT_Postive_Master_TC001() {	
		/* get hierarchies
						Loop over tables
							{
								getRejectedRecords()
								Match with 0
							}
						Assert()
						}
		*/
		//get Actual rejected rows post dataload 
		int rejectedRowsCount = getRejectedRowsFromSPPM();
		assertEquals(EXPECTED_REJECTED_ROWS, rejectedRowsCount);
	}
	
	@Test(groups = { "dt.negetive"})
	public void DT_Negetive_Master_Null_TC001() {	
		//get Actual NULL rejected rows post dataload 
		int nullRowsCount = getNullRowsFromSPPM();
		assertEquals(EXPECTED_NULL_ROWS_COUNT, nullRowsCount);
	}
	
	@Test(groups = { "dt.negetive"})
	public void DT_Negetive_Master_Numeric_TC001() {	
		//get Actual Numeric rejected rows post dataload 
		int numericRejectRowsCount = getNumericRejectRowsFromSPPM();
		assertEquals(EXPECTED_NUMERIC_REJECT_ROWS_COUNT, numericRejectRowsCount);
	}
	
	public int getRejectedRowsFromSPPM()
	{
	// This will be generic validation service
		return 0;
	}
	
	public int getNullRowsFromSPPM()
	{
	// This will be generic validation service
		return 3;
	}
	
	public int getNumericRejectRowsFromSPPM()
	{
	// This will be generic validation service
		return 4;
	}	
}