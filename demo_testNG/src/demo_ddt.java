import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo_ddt {
	
  @Test(dataProvider = "supplyData")
  public void test5(String name, int salary) {
	  System.out.println(name + " ---- " + salary);
  }
  
  @DataProvider
  public Object[][] supplyData() {
	  Object[][] data = new Object[3][2];
	  data[0][0] = "Nupur";
	  data[0][1] = 10000;

	  data[1][0] = "Ganesh";
	  data[1][1] = 15000;

	  data[2][0] = "Mayuresh";
	  data[2][1] = 30000;
	  
	  return data;
  }
  
  @DataProvider
  public Object[][] supplyDate2() {
	  Object[][] data = new Object[3][2];
	  return data;
  }
  
  
}
