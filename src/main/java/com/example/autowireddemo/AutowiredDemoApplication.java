package com.example.autowireddemo;

import com.example.components.Employee;
import com.example.components.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.components"})
public class AutowiredDemoApplication implements CommandLineRunner {

	@Autowired
	private ServerProperties serverProperties;

	@Override
	public void run(String... args) {
		System.out.println(serverProperties);
	}

	public static void main(String[] args) {
//		SpringApplication.run(AutowiredDemoApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(AutowiredDemoApplication.class, args);
		Employee emp = context.getBean(Employee.class);
		emp.setId(104);
		emp.setEname("Ramanan");
		emp.showEmployeeDetails();

	}

}
