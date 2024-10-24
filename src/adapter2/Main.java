package adapter2;

import domain.Covid19Pacient;
import domain.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		SymptomFactory symptomFactory = new SymptomFactory();
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35, symptomFactory);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		
		Covid19Pacient pacient2 = new Covid19Pacient("jon", 60, symptomFactory);
		
		pacient2.addSymptomByName("disnea", 2);
		pacient2.addSymptomByName("cefalea", 1);
		pacient2.addSymptomByName("astenia", 3);
		
		ShowPacientTableGUI gui = new ShowPacientTableGUI(pacient);
		
		ShowPacientTableGUI gui2 = new ShowPacientTableGUI(pacient2);
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
		gui2.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui2.setVisible(true);

	}

}
