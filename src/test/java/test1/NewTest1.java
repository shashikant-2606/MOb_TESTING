package test1;

import org.testng.annotations.Test;

public class NewTest1 extends NewTest
{
  @Test
  public void f() 
  {
	  driver.get("https://www.amazon.in/");
  }
}
