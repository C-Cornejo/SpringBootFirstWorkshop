package tech.istrategies.repositories;

import org.springframework.data.repository.CrudRepository;

import tech.istrategies.models.Customers;

public interface CustomersRepository extends CrudRepository<Customers,Integer>{

	
}
