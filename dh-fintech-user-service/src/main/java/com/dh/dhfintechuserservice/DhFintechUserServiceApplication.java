package com.dh.dhfintechuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableDiscoveryClient
public class DhFintechUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhFintechUserServiceApplication.class, args);
	}

}

@RestController
class UserService {

	@RequestMapping(method = RequestMethod.GET, path = "users/details/{id}")
	public Map<String, Object> detail(@PathVariable("id") Long idUser,
									  @RequestHeader("user-request-header") String header) {

		Map<String, Object> response = new HashMap<>();
		response.put("id_user", idUser);
		response.put("custom_header_value", header);

		return response;

	}

}