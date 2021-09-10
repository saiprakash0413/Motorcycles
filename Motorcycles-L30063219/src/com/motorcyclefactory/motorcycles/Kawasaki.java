package com.motorcyclefactory.motorcycles;

import com.motorcyclefactory.motorcycles.factory.Dirtbike;
import com.motorcyclefactory.motorcycles.factory.MotorcycleFactory;
import com.motorcyclefactory.motorcycles.factory.Nakedbike;
/* Kawasaki is a Kawasaki factory*/
/*author Saiprakash Reddy*/

public class Kawasaki extends MotorcycleFactory {

	@Override
	public Nakedbike getNakedbike() {
		return new Z1000();
	}
	@Override
	public Dirtbike getDirtbike() {
		return new KX250();
	}

}
