package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomCounter {
	
	/**
	 * Anything that will count symptom data from a source
	 * The important part is, the return value from the operation, which is a TreeMap of strings,Integer
	 * that may contain many duplications
	 * 
	 */

	TreeMap<String, Integer> getSymptomsCounted(List<String> ListToCount);

}
