package com.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Thaiana H.B.C
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Jose", "Silva", "Desenvolvedor", 5000.0));
		this.repository.save(new Employee("Maria", "Oliveira", "Médica", 8000.0));
		this.repository.save(new Employee("Sebastião", "Prado", "Advogado", 8000.0));
		this.repository.save(new Employee("Ana", "Carvalho", "Fisioterapeuta", 8000.0));
		this.repository.save(new Employee("Paulo", "Souza", "Administrador", 8000.0));
	}
}