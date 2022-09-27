package com.task;
import org.json.simple.JSONObject;

public class JSONP {

	public static void main(String[] args) {
		


				// In java JSONObject is used to create JSON object
				// which is a subclass of java.util.HashMap.

				JSONObject file = new JSONObject();

				file.put("Full Name", "Ritu Sharma");
				file.put("Roll No.", new Integer(1704310046));
				file.put("Tution Fees", new Double(65400));

				// To print in JSON format.
				System.out.print(file);
			}
		


	}


