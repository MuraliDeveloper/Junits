package service;

public class Service {

	/**
	 * Returns true if city value is "bangalore","hyderabad" , "chennai".
	 * Returns false for any other city.
	 * 
	 * @param city
	 * @return
	 */
	public boolean isValidCity(String city) {
		if ("bangalore".equalsIgnoreCase(city) || 
				"hyderabad".equalsIgnoreCase(city)
				|| "chennai".equalsIgnoreCase(city)) {
			return true;
		}
		return false;
	}
	
}
