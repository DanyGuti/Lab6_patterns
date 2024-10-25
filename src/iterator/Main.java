package iterator;
import domain.SymptomFactory;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.InvertedIterator;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			SymptomFactory symptomFactory = new SymptomFactory();
			Covid19Pacient p=new Covid19Pacient("Ane", 29, symptomFactory);
			p.addSymptom(new Symptom("s1", 10, 15), 1);
			p.addSymptom(new Symptom("s2", 10, 3), 2);
			p.addSymptom(new Symptom("s3", 10, 2), 3);
			p.addSymptom(new Symptom("s4", 10, 1), 4);
			p.addSymptom(new Symptom("s5", 10, 14), 5);
			
			Sorting sorting = new Sorting();
			Covid19AdapterIterator adapterItr = new Covid19AdapterIterator(p);
			
			// Covid 19 pacient comparator by name
			Covid19PacientComparatorByName comparatorName = new Covid19PacientComparatorByName();
	        Iterator<Object> sortedSymptoms = sorting.sortedIterator(adapterItr, comparatorName);
			
			// Covid 19 pacient comparator by severityIndex
			Covid19PacientComparatorBySevIndex comparatorBySevIndex = new Covid19PacientComparatorBySevIndex();
	        // Iterator<Object> sortedSymptoms = sorting.sortedIterator(adapterItr, comparatorBySevIndex);
			
			while(sortedSymptoms.hasNext()) {
				System.out.println(sortedSymptoms.next());
			 }				
		}

	}

