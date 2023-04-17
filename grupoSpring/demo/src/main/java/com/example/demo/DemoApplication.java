package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/* 
	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		Estudiante estudiante = new Estudiante("Julian","Camacho","3147242572");
		repositorio.save(estudiante);

		Estudiante estudiante2 = new Estudiante("Carlos","Mesa","3105320861");
		repositorio.save(estudiante2);
	}*/

}
