package biserv.model;

import java.util.ArrayList;
import java.util.Collection;

public class GPSData {

	//Déclaration des variables
	private Collection<GPSPosition> gpsPositionCollection = new ArrayList<GPSPosition>();
	
	//Dernière position GPS
	public GPSPosition getLastGpsPosition(int subscriberId)
	{
		return null;
	}
	
	//Postion recente
	public GPSPosition getRecentGpsPosition(int subscriberId)
	{
		return null;
	}
	
}
