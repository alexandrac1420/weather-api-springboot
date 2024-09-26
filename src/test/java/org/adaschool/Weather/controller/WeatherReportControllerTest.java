package org.adaschool.Weather.controller;

import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class WeatherReportControllerTest {

    @Mock
    WeatherReportService weatherReportService;

    @InjectMocks
    WeatherReportController weatherReportController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getWeatherReport_ReturnsWeatherReport() {
        double latitude = 37.8267;
        double longitude = -122.4233;

        WeatherReport mockReport = new WeatherReport();
        mockReport.setTemperature(291.53);
        mockReport.setHumidity(75.0);

        when(weatherReportService.getWeatherReport(latitude, longitude)).thenReturn(mockReport);

        WeatherReport result = weatherReportController.getWeatherReport(latitude, longitude);

        assertEquals(291.53, result.getTemperature(), 0.01);
        assertEquals(75.0, result.getHumidity(), 0.01);
        verify(weatherReportService, times(1)).getWeatherReport(latitude, longitude);
    }
}
