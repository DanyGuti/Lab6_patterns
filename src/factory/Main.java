package factory;

import domain.Covid19Pacient;
import domain.Medicament;
import domain.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		SymptomFactory symptomFactory = new SymptomFactory();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35, symptomFactory);
		new PacientSymptomGUI(p1);
	}

}
