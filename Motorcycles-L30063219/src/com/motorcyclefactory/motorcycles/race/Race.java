package com.motorcyclefactory.motorcycles.race;

import java.util.ArrayList;

import com.motorcyclefactory.motorcycles.KTM;
import com.motorcyclefactory.motorcycles.Kawasaki;
import com.motorcyclefactory.motorcycles.Pulser;
import com.motorcyclefactory.motorcycles.Splender;
import com.motorcyclefactory.motorcycles.factory.Color;
import com.motorcyclefactory.motorcycles.factory.Dirtbike;
import com.motorcyclefactory.motorcycles.factory.Motorcycle;
import com.motorcyclefactory.motorcycles.factory.MotorcycleFactory;
import com.motorcyclefactory.motorcycles.factory.Nakedbike;
import com.motorcyclefactory.motorcycles.tracking.DirtTrack;
import com.motorcyclefactory.motorcycles.tracking.StreetTrack;
import com.motorcyclefactory.motorcycles.tracking.Track;

public class Race {
	ArrayList<Motorcycle<Integer>> bikes = new ArrayList<Motorcycle<Integer>>();
	Track track;
	Team ktmTeam;
	Team kawasakiTeam;
	Team pulserTeam;
	Team splenderTeam;
	 
	
	public Race(Track track) {
		this.track = track;
		MotorcycleFactory ktm = new KTM();
		ktmTeam = new Team(ktm);
		MotorcycleFactory kawasaki = new Kawasaki();
		kawasakiTeam = new Team(kawasaki);
		MotorcycleFactory pulser = new Pulser();
		pulserTeam = new Team(pulser);
		MotorcycleFactory splender = new Splender();
		splenderTeam = new Team(splender);
		bikes.add(ktmTeam.getNakedBike());
		bikes.add(ktmTeam.getDirtBike());
		bikes.add(kawasakiTeam.getNakedBike());
		bikes.add(kawasakiTeam.getDirtBike());
		bikes.add(pulserTeam.getDirtBike());
		bikes.add(pulserTeam.getNakedBike());
		bikes.add(splenderTeam.getDirtBike());
		bikes.add(splenderTeam.getNakedBike());
	}
	
	public void Penalty() {
		for(Motorcycle<Integer> m : bikes) {
			if(track instanceof DirtTrack) {
				if(m instanceof Nakedbike)
					m.setTopSpeed(m.getTopSpeed() - 100);
			}
			if(track instanceof StreetTrack) {
				if(m instanceof Dirtbike)
					m.setTopSpeed(m.getTopSpeed() - 10);
			}
		}
	}
	
	public void Go() {
		int i = bikes.size();
		System.out.println("Ready... Set... Go!");
		Motorcycle<Integer> winner = new Motorcycle<Integer>("", 0, 0, Color.ORANGE);
		bikes.sort((m1, m2)-> m1.getTopSpeed().compareTo(m2.getTopSpeed()));
		for(Motorcycle<Integer> m : bikes) {
				System.out.println("Position " + i + ": " + m);
				i--;
			}
		winner = bikes.get(bikes.size() - 1);
		System.out.println("The winner is " + winner + "!");
		System.out.println("--------------------------\n");
		}
	
	public void PrintRace() {
		System.out.println("Race is at " + track);
		System.out.println("Team KTM is " + ktmTeam);
		System.out.println("Team Kawaski is " + kawasakiTeam);
		System.out.println("Team Pulser is " + pulserTeam);
		System.out.println("Team Splender is " + splenderTeam);
	}
}
