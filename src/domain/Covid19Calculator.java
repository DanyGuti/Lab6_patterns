package domain;

import java.util.Map;
import java.util.Set;

public class Covid19Calculator implements ICovid19Calculator{
	@Override
	public double covidImpact(Map<Symptom,Integer> symptoms, int age) {
		double afection=0;
		double increment=0;
		double impact=0;
		
		//calculate afection
		for(Symptom c: symptoms.keySet()) {
			if (c!=null )
			   afection=afection+c.getSeverityIndex()*symptoms.get(c);
		}
		afection=afection/symptoms.size();
		
		//calculate increment
		if (age > 65) increment=afection * 0.5;
		
		//calculate impact
		impact=afection+increment;
		return impact;
	}
	
}