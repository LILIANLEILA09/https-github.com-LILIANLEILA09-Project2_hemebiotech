package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptomFromList implements ISymptomCounter {
	
     public TreeMap<String,Integer> getSymptomsCounted(List<String> listToCount){
    	 
    	TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		
		
		for(String symptom : listToCount) {
			if(!map.containsKey (symptom)){
			map.put(symptom, 1);
			
		}else {
			map.put(symptom,map.get(symptom)+ 1);
		}
		}
		return map;
		
     }
}