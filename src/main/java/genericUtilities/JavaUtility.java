package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class contains reusable methods to perform java related operations
 * @author sweth
 */
public class JavaUtility {
	/**
	 * this method fetches current date and time in specified format
	 * @return
	 */
	public String getCurrentTime()
	{
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
		return s.format(d);
	}

}
