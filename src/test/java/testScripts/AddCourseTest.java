package testScripts;

import java.util.Map;

import org.testng.annotations.Test;

public class AddCourseTest extends BaseClass {

	@Test
	public void addCourseTest()
	{
		home.clickCourseTab();
		home.clickCourseListLink();
		courseList.clickNewButton();
		Map<string,String>map=excel.readFromExcel("Add course");
		addCourse.setName(map.get("Name"));
		addCourse.selectCategory(web,map.get("Category"));
		addCourse.setPrice(map.get("Price"));
		addCourse.setDescription(map.get("Description"),web);
		addCourse.clickSave();
		
		System.out.println(courseList.getSuccessMessage());
		courseList.deleteCourse(web,map.get("Name"));
		System.out.println(courseList.getSuccessMessage());
	}
	
}
