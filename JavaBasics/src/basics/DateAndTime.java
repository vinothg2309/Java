package basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		System.out.println(getFormattedDate("MM/dd/yyyy"));
		System.out.println(getFormattedDate("dd/MMMM/yy"));
		//System.out.println(getFormattedDate("dd/MMMM/yyfffff"));
		System.out.println(getDate("12/22/2023","MM/dd/yyyy"));
		//System.out.println(getDate("12/22/2023",null));
		Date fromDateUI = getDate("12/22/2023","MM/dd/yyyy");
		Calendar fromDate = Calendar.getInstance();
		fromDate.setTime(fromDateUI);
		System.out.println(fromDate.getTime());
		fromDate.set(Calendar.HOUR, 0);
		fromDate.set(Calendar.MINUTE, 0);
		fromDate.set(Calendar.SECOND, 0);
		System.out.println(fromDate.getTime());
		fromDate.set(Calendar.DATE, fromDate.get(Calendar.DATE)+1);
		System.out.println(fromDate.getTime());
		
	}
	public static String getFormattedDate(String dateFormat)
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		return formatter.format(date);
		
	}
	public static Date getDate(String strDate,String formatter)
	{
		SimpleDateFormat format = new SimpleDateFormat(formatter);
		try {
			return format.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR " +e.getMessage());
			e.printStackTrace();
		}
		return null;
		
	}

}
