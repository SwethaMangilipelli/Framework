package testScripts;

import java.util.Map;

import org.testng.annotations.Test;

public class AddCategoryTest extends BaseClass{
	@Test
	public void addCategoryTest()
	{
		home.clickCourseTab();
		home.clickCategoryLink();
		
		category.clickNewButton();
		Map<String,String>map=excel.readFromExcel("add category");
		addCategory.setName(map.get("Name"));
		addCategory(web,map.get("Name"));
		addCategory.clickSave();
		
		System.out.println(category.getSuccessMessage());
		category.deleteCategory(web,map.get("Name"));
		System.out.println(category.getSuccessMessage());
	}

}
