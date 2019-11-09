package com.lti.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWorker 
{
	
	public static LocalDate formatDate(String s)
	{
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ld=LocalDate.parse(s,formatter);
		return ld;
	}

}
