package tech.istrategies.repositories;
import tech.istrategies.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders,Integer> {

}
