package tech.istrategies.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tech.istrategies.models.Customers;
import tech.istrategies.repositories.CustomersRepository;

@Controller
@RequestMapping(path="/customers")
public class CustomersController {
	
	// El controlador requiere una variable de tipo repositorio
	@Autowired
	private CustomersRepository repository;
	
	@GetMapping("/all") //no necesita mas argumentos en la uri
	public @ResponseBody Iterable<Customers> getAllCustomers()
	{
		return  repository.findAll();
	}
	
	@PostMapping(path="/save")
	public Customers createCustomers(@Valid @RequestBody Customers newCustomer) 
	{
		return repository.save(newCustomer);
	}
	
	@GetMapping(path="/findById/{id}")
	public @ResponseBody Optional<Customers> getCustomersById(@PathVariable(value="id") Integer id)
	{
		return repository.findById(id);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<?> deleteCustomers(@PathVariable(value="id") Integer id)
	{
		// Como validacion se puede utilizar un findById
		repository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
