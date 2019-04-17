package com.realpacific.microservices.controllers;

import com.realpacific.microservices.entities.CurrencyConverterBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/{quantity}")
    public CurrencyConverterBean retrieveExchangeService(@PathVariable String from, @PathVariable String to, @PathVariable float quantity) {
        Map<String, String> map = new HashMap<>();
        map.put("from", from);
        map.put("to", to);
        ResponseEntity<CurrencyConverterBean> response = new RestTemplate()
                .getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                        CurrencyConverterBean.class, map);

        CurrencyConverterBean bean = response.getBody();
        System.out.println(response.getStatusCode());
        System.out.println(response.toString());
        System.out.println(bean);

        return new CurrencyConverterBean(bean.getId(), bean.getFrom(), bean.getTo(), bean.getConversionMultiple(),
                bean.getQuantity(), bean.getConversionMultiple().multiply(BigDecimal.valueOf(quantity)), bean.getPort());
    }
}
