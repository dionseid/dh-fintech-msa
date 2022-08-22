package com.dh.dhfintechproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableDiscoveryClient
public class DhFintechProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhFintechProductServiceApplication.class, args);
	}

	@RestController
	@RequestMapping("/products")
	class ProductService {

		@GetMapping(path = "/details/{id}")
		public Map<String, Object> detail(@PathVariable("id") Long idProduct) {

			Map<String, Object> response = new HashMap<>();

			response.put("id_product", idProduct);

			return response;

		}

	}

}
