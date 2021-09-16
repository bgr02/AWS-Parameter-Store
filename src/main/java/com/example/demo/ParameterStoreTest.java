package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ParameterStoreTest implements CommandLineRunner {

    @Value("${profile.value}")
    private String profile;
	
	@Value("${test.value}")
    private String test_value;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Profile Property: " + profile);
		System.out.println("Test Default Property: " + test_value);
    }

}

