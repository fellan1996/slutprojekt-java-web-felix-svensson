package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.GettheWeather;
import model.WeatherBean;

@WebServlet("/OWservlet")
public class OWservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		Gets the input that the user entered in the search-form
		String cityStr = request.getParameter("city");
		String countryStr = request.getParameter("country");
		
//		Creates a new weatherBean object with the information that was entered into the search form as arguments
		WeatherBean wBean = new WeatherBean(cityStr, countryStr);

		GettheWeather.getWeather(wBean);
//		Creates a session and adds wBean to it
		request.setAttribute("wBean", wBean);
		
//		capitalizes the first letter of the city and country
		String cityForCookie =cityStr.substring(0, 1).toUpperCase() + cityStr.substring(1);
		String countryForCookie = countryStr.substring(0, 1).toUpperCase() + countryStr.substring(1);
		
//		Adds those strings to the respective cookie below
		Cookie cityCookie = new Cookie("preCity", cityForCookie);
		Cookie countryCookie = new Cookie("preCountry", countryForCookie);
		
//		Sets how long the cookies should last
		cityCookie.setMaxAge(500);
		countryCookie.setMaxAge(500);
		
//		Adds the cookies to the response on the clients browser
		response.addCookie(cityCookie);
		response.addCookie(countryCookie);
		
//		User gets to the next page where the weather is shown
		RequestDispatcher rd = request.getRequestDispatcher("views/showWeather.jsp");
		rd.forward(request, response);
	}
//	Sends it to the doGet method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}