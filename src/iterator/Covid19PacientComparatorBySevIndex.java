package iterator;

import java.util.Comparator;

import domain.Symptom;

public class Covid19PacientComparatorBySevIndex implements Comparator<Object>{
	// Ordenación por symptom index de severidad
	@Override
	public int compare(Object a, Object b) {
		return compareBySevIndex((Symptom)a, (Symptom)b);
	}
	
	public int compareBySevIndex(Symptom a, Symptom b) {
		return a.getSeverityIndex() - b.getSeverityIndex();
	}
	
}