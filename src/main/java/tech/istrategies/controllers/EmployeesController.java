package tech.istrategies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tech.istrategies.models.Employees;
import tech.istrategies.repositories.EmployeesRepository;

@Controller
@RequestMapping("employees/")
public class EmployeesController {

	
	
	@Autowired
	private EmployeesRepository repository;
	
	@GetMapping("/all") //no necesita mas argumentos en la uri
	public @ResponseBody Iterable<Employees> getAllEmployees()
	{
		return  repository.findAll();
	}
}
