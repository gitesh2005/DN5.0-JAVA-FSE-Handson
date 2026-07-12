package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private ApplicationContext context;

    @Autowired
    private CountryService countryService;

    // Returns India details
    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        LOGGER.debug("Start of getCountryIndia() method.");
        Country country = context.getBean("countryIndia", Country.class);
        LOGGER.debug("End of getCountryIndia() method.");
        return country;
    }

    // Returns country based on country code
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }

    // Returns all countries
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.debug("Start of getAllCountries() method.");
        List<Country> countryList = countryService.getAllCountries();
        LOGGER.debug("End of getAllCountries() method.");
        return countryList;
    }
}