package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
	
	public static void main(String[] args) 
	{
		Date date= new Date();
		System.out.println(date);
		
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formattage.format(date));
		
		Date date2=new Date();
		date2.setHours(23);
		date2.setMinutes(30);
		date2.setSeconds(59);
		SimpleDateFormat formattage2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formattage2.format(date2));
		
		Date date3= new Date();
		System.out.println(formattage2.format(date3));
		System.out.println("----------------");
		
		Calendar cal = Calendar.getInstance();
		Date maintenant = cal.getTime();
		System.out.println(formattage.format(maintenant));
		
		Calendar cal1 = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 59);
		
		Date date4 = cal.getTime();
		System.out.println(formattage2.format(date4));
	}

}
