package com.ui.test;
import org.testng.annotations.Test;

import com.ui.pojo.User;

public class LoginTest extends TestBase{

	
	@Test(description="Verified if the valid User is able to login to the application",groups= {"e2e","sanity"},
			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {
		//assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Gangesh Jha");
	homePage.goToLoginPage().doLoginWith(user.getuserName(), user.getPassword());
		
		
	}
}
