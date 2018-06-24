package tech.istrategies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tech.istrategies.models.OrderDetails;
import tech.istrategies.repositories.OrderDetailsRepository;

@Controller
@RequestMapping("orderDetails/")
public class OrderDetailsController {

	private OrderDetailsRepository repository;
	
	
	@GetMapping("/all") //no necesita mas argumentos en la uri
	public @ResponseBody Iterable<OrderDetails> getAllOrderssDetails()
	{
		return  repository.findAll();
	}
}
