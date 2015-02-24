package biserv.model;

import java.util.Date;

public class Incident {

	private int numero;
	private Date dateCreation;
	private int statutIncident;
	private String [] gpsPosition;
	private String incidentDescription;
	private String passengerOrOwnerName;
	private String taxiRegistrationNumber;
	private int incidentType;
	
	public void setIncidentInfos (int numero, Date dateCreation, int statutIncident, String [] gpsPosition,
			String incidentDescription, String passengerOrOwnerName, String taxiRegistrationNumber,
			int incidentType)
	{
		this.numero = numero;
		this.dateCreation = dateCreation;
		this.statutIncident = statutIncident;
		this.gpsPosition = gpsPosition;
		this.incidentDescription = incidentDescription;
		this.passengerOrOwnerName = passengerOrOwnerName;
		this.taxiRegistrationNumber = taxiRegistrationNumber;
		this.incidentType = incidentType;
	}
	
}
