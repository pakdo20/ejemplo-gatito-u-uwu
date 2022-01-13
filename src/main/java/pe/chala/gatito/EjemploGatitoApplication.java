package pe.chala.gatito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pe.chala.gatito.controllers"})
public class EjemploGatitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploGatitoApplication.class, args);
	}

}
