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
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);


	}

}
