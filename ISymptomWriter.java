package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ISymptomWriter {
	
  public void writeDataOnFile(TreeMap<String,Integer> mapCountedSymptoms);
}
