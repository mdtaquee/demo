package com.example.ApplicationDockerApi;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/time")
public class DockerApi {
	
	@GetMapping("/now")
    public String getCurrentTime() {
        return LocalTime.now().toString();
    }
	
	@GetMapping("/msg")
	public String sayHello()
	{
		return "Hello to Docker World";
	}
	
}

