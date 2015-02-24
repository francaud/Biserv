package biserv.model;

import java.util.ArrayList;

public class UserAccesGranter {

	/**
	 * Classe de gestion de connexion
	 */
	private ArrayList<UserInterfaceHandler> userHandlerCollection = new ArrayList();
	
	public boolean agreedUserConnection()
	{
		//Variable d'authorisation par défaut a false
		boolean auth = false;
		
		
		return auth;
	}
	
	//Acquisition d'un UserInterfaceHandler
	public UserInterfaceHandler getUserHandler(String userLogin)
	{
		UserInterfaceHandler uIH = new UserInterfaceHandler();
		
		/*Ajout de l'objet crée à la collection*/
		userHandlerCollection.add(uIH);
		
		return uIH;
	}
	
	//Fonctionnalité de vérification d'un Handler
	public boolean checkHandlerExist(String userLogin)
	{
		//Varible de vérification par défaut à false
		boolean exist = false;
		
		
		return exist;
	}
}
