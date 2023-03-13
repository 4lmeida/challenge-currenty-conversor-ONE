package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import dto.CurrencyDTO;
import util.Util;

public class CurrencyService {
	
	private String webService = "https://economia.awesomeapi.com.br/json/last/";
	private int codigoSucesso =  200;
	
	public CurrencyDTO findCurrency(String currency) throws Exception {
		String urlforlayer = webService + currency + "/json";
		
		try {
			URL url = new URL(urlforlayer);
			HttpURLConnection conect = (HttpURLConnection) url.openConnection();
			
			if(conect.getResponseCode() != codigoSucesso) {
				throw new RuntimeException("HTTP error code : " + conect.getResponseCode()); 
			}
			
			BufferedReader response = new BufferedReader(new InputStreamReader(conect.getInputStream()));
			String jsonAtString = Util.converteJsonEmString(response);
			
			Gson gson = new Gson();
			CurrencyDTO dto = gson.fromJson(jsonAtString, CurrencyDTO.class);
			
			
		return dto;
		}
		catch(Exception e) {
			throw new Exception("ERRO "  +  e.getMessage());
		}

	}

}
