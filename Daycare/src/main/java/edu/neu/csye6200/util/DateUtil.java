/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.util;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author hiral
 */
public class DateUtil {
    
    
    public static Date parseStringToDate(String dateString, String format)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try
	{
            Date date = sdf.parse(dateString);
            return date;
  
        }
	catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public static String parseDateToString(Date date, String format)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateStr = sdf.format(date);
        return dateStr;
    }
    
}
