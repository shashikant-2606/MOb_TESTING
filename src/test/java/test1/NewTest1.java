package test1;

import org.testng.annotations.Test;

public class NewTest1 extends NewTest
{
  @Test
  public void urlcheck() 
  {
	  driver.get("https://www.amazon.in/");
	 String s1= driver.getTitle();
	 System.out.println(s1);
  }
}
