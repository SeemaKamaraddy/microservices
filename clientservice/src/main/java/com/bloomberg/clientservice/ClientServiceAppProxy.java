package com.bloomberg.clientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "client-service-app", url = "localhost:9090")
@FeignClient(name="client-service-app")
//@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="client-service-app")
public interface ClientServiceAppProxy {
	
	@GetMapping("/clientServiceApp/product/{num1}/{num2}")
	public int multiply(@PathVariable("num1") int num1, @PathVariable("num2") int num2);
	
}
