package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19AdapterIterator  implements InvertedIterator {
	protected Covid19Pacient pacient;
	List<Symptom> symptoms=new Vector<Symptom>();
	int endPos=0;
	int normalPos=0;

	public Covid19AdapterIterator(Covid19Pacient p) {
		this.pacient = p;
	    symptoms = new ArrayList<Symptom>(p.getSymptoms());
    }
	  
	public List<Symptom> getSymptoms() {
		return symptoms;
	}

	@Override
	public Object previous() {
		if (this.hasPrevious()) {
	        endPos--;
			return symptoms.get(endPos);
		}
		return null;
	}
	
	@Override
	public boolean hasPrevious() {
		return endPos > 0;
	}
	
	@Override
	public void goLast() {
		endPos = symptoms.size();
	}
	
//	@Override
//	public boolean hasNext() {
//		return normalPos<symptoms.size();
//	}
//
//	@Override
//	public Object next() {
//		Symptom symptom=symptoms.get(normalPos);
//		normalPos++;
//		return symptom;
//	}
  
}