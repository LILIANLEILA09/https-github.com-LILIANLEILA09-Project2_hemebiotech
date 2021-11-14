package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	FileWriter writer ;


	public WriteSymptomDataToFile(String outputfile) {
	}
	public void writeDataOnFile(TreeMap<String,Integer> symptoms) {
		
		FileWriter writer;
		
	try {
		writer = new FileWriter("result.out");
		for(String symptom : symptoms.keySet())
		
		{
         writer.write(symptom+ "= " +symptoms.get(symptom)+"\n");
}
  writer.close();
  
	}catch (IOException e) {
		e.printStackTrace();
		
	}

}
}