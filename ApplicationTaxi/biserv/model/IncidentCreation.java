package biserv.model;

/**
 * Description de l'Objet incident 
 */

public class IncidentCreation {

	//Déclaration des variables en mode private
	
	private String gpsPosition;
	private int subscriberId;
	private String date;
	private int taxiId;
	
	
	public IncidentCreation(String gpsPosition, int subscriberId, String date, int taxiId){
		
		setInfos(gpsPosition, subscriberId, date, taxiId);
		
	}
	
	//Allocation des variables via le setter
	public void setInfos(String gpsPosition, int subscriberId, String date, int taxiId){
		
		this.gpsPosition = gpsPosition;
		this.subscriberId = subscriberId;
		this.date = date;
		this.taxiId = taxiId;
	}
	
	//A redefinir peut être 
	public void setTaxi(){
		
	}
}
