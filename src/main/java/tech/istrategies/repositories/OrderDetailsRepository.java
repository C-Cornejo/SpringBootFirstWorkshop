package tech.istrategies.repositories;

import org.springframework.data.repository.CrudRepository;

import tech.istrategies.models.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails,Integer>{

}
