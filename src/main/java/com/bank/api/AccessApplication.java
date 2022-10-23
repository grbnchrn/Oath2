package com.bank.api;

import com.bank.api.repository.CardDetailsRepository;
import com.bank.api.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessApplication  implements ApplicationRunner {

	@Autowired
	CardDetailsRepository cardDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccessApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		cardDetailsRepository.saveAll(JsonUtil.getJsonStringAsList());
	}
}
