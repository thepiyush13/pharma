package edu.isys.assign3.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.isys.assign3.domain.Record;

/**
 * Helps load json data into domain object. *
 */
public class JsonUtil {

	private static String MERCY_EAST_EHR = "mercy-east-ehr.json";
	
	/**
	 * Loads EHR data or a list of Record objects from a json file.
	 * @return a list of Record objects.
	 */
	public static List<Record> loadRecordsFromJson() {
		String json = readFile(MERCY_EAST_EHR);
		return new Gson().fromJson(json, new TypeToken<List<Record>>(){}
			.getType());
	}
	
	/**
	 * Gets the contents of a json file as a String.
	 * @param file the name of the file
	 * @return a String containing the file contents
	 */
	private static String readFile(String fileName) {
		String json = "";
		
		try {
			InputStream inputStream = JsonUtil.class.getResourceAsStream(fileName);
			InputStreamReader streamReader = new InputStreamReader(inputStream);
	        BufferedReader bufferedReader = new BufferedReader(streamReader);
	        while (bufferedReader.ready()) {
	            json += bufferedReader.readLine();
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
	
	private JsonUtil() {}
	
}
