package com.motorcyclefactory.motorcycles.race;

import com.motorcyclefactory.motorcycles.tracking.DirtTrack;
import com.motorcyclefactory.motorcycles.tracking.StreetTrack;
import com.motorcyclefactory.motorcycles.tracking.Track;

public class Driver {

	public static void main(String[] args) {
		
		Track dirttrack = new DirtTrack("Chicago");
		Track streettrack = new StreetTrack("North Greenview");
		Race dirtrace = new Race(dirttrack);
		Race streetrace = new Race(streettrack);
		dirtrace.PrintRace();
		dirtrace.Penalty();
		dirtrace.Go();
		streetrace.PrintRace();
		streetrace.Penalty();
		streetrace.Go();

	}

}
