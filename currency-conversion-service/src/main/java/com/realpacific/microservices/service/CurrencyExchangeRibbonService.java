package com.realpacific.microservices.service;

import com.realpacific.microservices.entities.CurrencyConverterBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service")
//@RibbonClient(name = "currency-exchange-service")
@FeignClient(name = "zuul-api-gateway-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeRibbonService {
    //@GetMapping("/currency-exchange/from/{from}/to/{to}")
    @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    CurrencyConverterBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
