package observer;

import java.util.Observable;
import domain.SymptomFactory;
import observer.Covid19Pacient;
import observer.PacientSymptomGUI;
import observer.PacientThermometerGUI;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory factory = new SymptomFactory();
		Observable pacient=new Covid19Pacient("aitor", 35, factory); 
		Observable pacient1=new Covid19Pacient("jon", 40, factory); 
		new PacientObserverGUI (pacient); 
		new PacientSymptomGUI ((Covid19Pacient)pacient); 
		new PacientObserverGUI (pacient1); 
		new PacientSymptomGUI ((Covid19Pacient)pacient1); 
		new PacientThermometerGUI (pacient1);
		new PacientThermometerGUI (pacient);
	}


} 
