package com.motorcyclefactory.motorcycles.race;

import com.motorcyclefactory.motorcycles.factory.Dirtbike;
import com.motorcyclefactory.motorcycles.factory.MotorcycleFactory;
import com.motorcyclefactory.motorcycles.factory.Nakedbike;


public class Team {
	private Nakedbike nakedbike;
	private Dirtbike dirtbike;
	
	public Team(MotorcycleFactory motorcyclefactory) {
		nakedbike = motorcyclefactory.getNakedbike();
		dirtbike = motorcyclefactory.getDirtbike();
	}
	
	public Nakedbike getNakedBike(){
		return nakedbike;
	}
	public Dirtbike getDirtBike(){
		return dirtbike;
	}
	public String toString() {
		return "Racing: " + this.dirtbike + " \n" + this.nakedbike;
	}

}
