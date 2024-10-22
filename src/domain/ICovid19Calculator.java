package domain;

import java.util.Map;
import java.util.Set;

public interface ICovid19Calculator {
	public double covidImpact(Map<Symptom,Integer> symptoms, int age);
}