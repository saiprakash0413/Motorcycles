package com.motorcyclefactory.motorcycles;

import com.motorcyclefactory.motorcycles.factory.Dirtbike;
import com.motorcyclefactory.motorcycles.factory.MotorcycleFactory;
import com.motorcyclefactory.motorcycles.factory.Nakedbike;
/* Splender is a Splender factory*/
/*author Saiprakash Reddy*/

public class Splender extends MotorcycleFactory {

	@Override
	public Nakedbike getNakedbike() {
		
		return new SplenderPlus();
	}

	@Override
	public Dirtbike getDirtbike() {
		
		return new SplenderIsmart();
	}

}
