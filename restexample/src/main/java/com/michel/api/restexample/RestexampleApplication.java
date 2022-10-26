package com.michel.api.restexample;

import com.michel.api.restexample.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class RestexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestexampleApplication.class, args);
	}
    public List<Student> hello(){
         return List.of(
				 new  Student(
						 1L,
						 "Mariam",
						 "marriam.jamal@gmail.com",
						 LocalDate.of(2000, Month.JANUARY,5),
						 21

				 )
		 );
	}
}
