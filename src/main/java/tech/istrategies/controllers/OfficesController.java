package tech.istrategies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tech.istrategies.models.Offices;
import tech.istrategies.repositories.OfficesRepository;

@Controller
@RequestMapping("offices/")
public class OfficesController {

	@Autowired
	private OfficesRepository repository;
	
	@GetMapping("/all") //no necesita mas argumentos en la uri
	public @ResponseBody Iterable<Offices> getAllOffices()
	{
		return  repository.findAll();
	}
}
