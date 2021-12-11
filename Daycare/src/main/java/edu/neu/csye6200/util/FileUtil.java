package edu.neu.csye6200.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A helper class with methods for read and write operations of CSV files
 * @author santhoshMaddi
 */
public class FileUtil {
	
	
	/**
	 * Reads a csv file from the input path.
	 * Converts the csv file contents into list of string where each string is a line in the file.
	 * returns the list of strings.
	 * @param filePath
	 * @return
	 */
	public static List<String> readCSVFile(String filePath){
		
		List<String> csvData= new ArrayList<>();
		String line = "";
		
		try (   FileReader fileReader = new FileReader(filePath);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);) 
		{
			 
            bufferedReader.readLine(); //Skip the header line
            while ((line = bufferedReader.readLine()) != null)    
            {  
            	csvData.add(line);
            
            }  
        
        } 
        catch (IOException e) {
			e.printStackTrace();
		}
		
		return csvData;
	}
	
	
	/**
	 * Writes a list of strings to a csv file in the given input path.
	 * Each string in the input list is written as a new line in the csv file.
	 * @param data
	 * @param filePath
	 */
	public static void writeToCSVFile(List<String> data, String filePath) {
		
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, false));){
			
			for (String line : data) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
