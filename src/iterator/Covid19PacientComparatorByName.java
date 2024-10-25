package iterator;

import java.util.Comparator;

import domain.Symptom;

public class Covid19PacientComparatorByName implements Comparator<Object>{
	// Ordenación por symptom name
	@Override
	public int compare(Object a, Object b) {
		return compareByName((Symptom)a, (Symptom)b);
	}
	
	public int compareByName(Symptom a, Symptom b) {
		return a.getName().compareTo(b.getName());
	}
}