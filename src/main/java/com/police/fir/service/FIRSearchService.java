package com.police.fir.service;

import com.police.fir.Entity.FIRSearchBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FIRSearchService {
        private final RestTemplate restTemplate;

    @Autowired
    public FIRSearchService( RestTemplate restTemplate){

        this.restTemplate = restTemplate;
    }

    public String searchAPIConsume(){

        System.out.println("hi");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String data = "sdistrict=8162&spolicestation=8162038&firFromDateStr=23/03/2022&firToDateStr=06/06/2022&regFirNo=0&radioValue=None&firYear=2022";

        HttpEntity<String> request = new HttpEntity<>(data, headers);
        System.out.println(restTemplate.postForObject("https://cctns.delhipolice.gov.in/citizen/regfirsearchpage.htm", request, String.class));
        return "hello";
    }
}
