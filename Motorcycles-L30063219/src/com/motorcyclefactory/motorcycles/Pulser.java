package com.motorcyclefactory.motorcycles;

import com.motorcyclefactory.motorcycles.factory.Dirtbike;
import com.motorcyclefactory.motorcycles.factory.MotorcycleFactory;
import com.motorcyclefactory.motorcycles.factory.Nakedbike;
/* Pulser is a Pulser factory*/
/*author Saiprakash Reddy*/

public class Pulser extends MotorcycleFactory {

	@Override
	public Nakedbike getNakedbike() {
		
		return new Pulser150();
	}

	@Override
	public Dirtbike getDirtbike() {
		
		return new Pulser125();
	}

}
