package dataprovider;

import org.testng.annotations.DataProvider;

public class dataproviders 
{
	@DataProvider(name="InvalidUserCredentials")
	public Object[][] usercredentialsdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="Wnimmyanup26@gmail.com";
		data[0][1]="pwd1234";
		
		data[1][0]="nimmyanup26@gmail.com";
		data[1][1]="Wpwd1234";
		
		data[2][0]="Wnimmyanup26@gmail.com";
		data[2][1]="Wpwd1234";
		
		return data;
	}
}
