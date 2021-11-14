package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Analyse {

	private ISymptomReader reader;
	private ISymptomCounter counter;
	private ISymptomWriter writer;

	public Analyse(ISymptomReader readerDepuisMain, ISymptomCounter counterDepuisMain,
			ISymptomWriter writerDepuisMain) {
		this.reader = readerDepuisMain;
		this.counter = counterDepuisMain;
		this.writer = writerDepuisMain;
	}
	/**
	 * Methode classe Analyse pour récuperer la liste des symptoms
	 * 
	 * @return List<String> la liste des symptoms
	 */

	public List<String> getSymptoms() {
		return this.reader.getSymptoms();
	}

	/**
	 * Methode de la classe Analyse pour compter et trier la liste des symptoms
	 * 
	 * @author leila
	 * @paramListeToCount
	 * @return TreeMap<String,Integer> symptomsCounted
	 */
	public TreeMap<String, Integer> countSymptoms(List<String> ListToCount) {
		return this.counter.getSymptomsCounted(ListToCount);

	}

	public void writeResult(TreeMap<String, Integer> map) {
		this.writer.writeDataOnFile(map);
	}
	/**
	 * Methode fait appel à Analyse et déclare une TreeMap de la liste de symptoms
	 * compter et trier Ecrit le resultat dans une map
	 * 
	 * 
	 * @param map return
	 */
}
