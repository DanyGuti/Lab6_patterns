package adapter2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames = new String[] {"Symptom", "Weight" };
	  private final List<Symptom> symptoms;

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient = p;
	    symptoms = new ArrayList<Symptom>(p.getSymptoms());
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return i == 0 ? "Symptom" : "Weight";
	  }

	  public int getRowCount() {
		  return symptoms.size();
		  // Challenge!
	  }

	  public Object getValueAt(int row, int col) {
		  switch (col) {
		  	case 0: return ((Object) symptoms.get(row));
		  	case 1: return ((Object) pacient.getWeight(symptoms.get(row)));
		  	
		  }
		  
		  // Challenge!
		  return null;
	  }
}
