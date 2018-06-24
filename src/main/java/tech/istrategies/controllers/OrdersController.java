package tech.istrategies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tech.istrategies.models.Employees;
import tech.istrategies.models.Orders;
import tech.istrategies.repositories.OrdersRepository;


@Controller
@RequestMapping(path="Orders/")
public class OrdersController {

	
	private OrdersRepository repository;
	
	@GetMapping("/all") //no necesita mas argumentos en la uri
	public @ResponseBody Iterable<Orders> getAllOrders()
	{
		return  repository.findAll();
	}
}
