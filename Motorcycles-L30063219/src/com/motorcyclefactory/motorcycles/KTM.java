package com.motorcyclefactory.motorcycles;

import com.motorcyclefactory.motorcycles.factory.Dirtbike;
import com.motorcyclefactory.motorcycles.factory.MotorcycleFactory;
import com.motorcyclefactory.motorcycles.factory.Nakedbike;
/* KTM is a KTM factory*/
/*author Saiprakash Reddy*/
public class KTM extends MotorcycleFactory {
	@Override
	public Nakedbike getNakedbike() {
		return new SuperDuke();
	}
	@Override
	public Dirtbike getDirtbike() {
		return new SX250();
	}

}
