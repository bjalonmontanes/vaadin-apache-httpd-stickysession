package com.vaadin.example.backend;

import com.vaadin.example.backend.domain.DailyForecast;
import com.vaadin.example.backend.domain.json.Forecast;
import com.vaadin.example.ui.WeatherDisplay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class WeatherServiceImpl implements WeatherService {
	
	private static final Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);

 /*   @Override
    public List<DailyForecast> getDailyForecast(String cityName) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RestTemplate restTemplate = new RestTemplate();

        // appid free from
        // https://openweathermap.org/
		//String uri = "http://api.openweathermap.org/data/2.5/weather";
		String uri = "http://api.openweathermap.org/data/2.5/forecast/daily";
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromHttpUrl(
                        uri)
                .queryParam("q", cityName).queryParam("mode", "json").queryParam("APPID", "b1b15e88fa797225412429c1c50c122a1")
                .queryParam("units", "metric");

        Forecast forecast = restTemplate.getForObject(
                uriComponentsBuilder.build().encode().toUri(), Forecast.class);
        return forecast.getDays().stream()
                .map((day) -> new DailyForecast(day.getDt(),
                        day.getTemp().getDay(),
                        day.getWeather().get(0).getDescription(),
                        day.getSpeed(), day.getHumidity()))
                .collect(Collectors.toList());
    }*/
	
	@Override
    public List<DailyForecast> getDailyForecast(String cityName) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date d = new Date();
        
        
        List<DailyForecast> dl = new ArrayList<DailyForecast> ();
        dl.add(new DailyForecast(d.getTime(), 262.65, "London", 4.57, 76));
        dl.add(new DailyForecast(d.getTime(), 262.65, "Carmona", 4.57, 76));
        
        logger.info("Searching info for " + cityName );
        return dl;
        
    }

    @Override
    public CompletableFuture<List<DailyForecast>> getDailyForecastAsync(
            String cityname) {
        return CompletableFuture.supplyAsync(() -> getDailyForecast(cityname));
    }
}
