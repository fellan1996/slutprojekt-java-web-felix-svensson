package model;

public class WeatherBean {

	private String temperatureStr;

	private String feelsLikeStr;

	private String cityStr;
	
	private String countryStr;
	
	private String cloudsStr;
	
//	The methods are in the same order as the fields
	public String getTemperatureStr() {
		return temperatureStr;
	}

	public void setTemperatureStr(String temperatureStr) {
		this.temperatureStr = temperatureStr;
	}

	public String getFeelsLikeStr() {
		return feelsLikeStr;
	}

	public void setFeelsLikeStr(String feelsLikeStr) {
		this.feelsLikeStr = feelsLikeStr;
	}

	public WeatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}

	public String getCityStr() {
		return cityStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public String getCloudsStr() {
		return cloudsStr;
	}

		public void setCloudsStr(String cloudsStr) {
		this.cloudsStr = cloudsStr;
	}
		
		
		
		
		
		
		
		
		
		
		

}
