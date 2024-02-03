package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;

public class AddUserTest extends BaseClass {
	@Test
	public void addUserTest()
	{
		SoftAssert s=new SoftAssert();
		
		
		home.clickUserTab();
		s.assertTrue(users.getPageHeader().contains("Users"));
		
		users.clickNewButton();
		s.assertEquals(addUser.getPageHeader(),"Add New User");
		
		Map<String,String>map=excel.readFromExcel("Add User");
		adduser.setEmail(map.get("Email"));
		addUser.setPassword(map.get("Password"));
		addUser.setFirstname(map.get("Firstname"));
		adduser.setLastname(map.get("Lastname"));
		addUser.setAddress(map.get("address"));
		addUser.setcontactInfo(map.get("Contact info"));
		addUser.uploadPhoto(map.get("Photo"));
		addUser.clickSave();
		
		s.assertEquals(users.getSuccessMessage(),"Success!");
		s.assertAll();
	}

}
