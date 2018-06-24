package tech.istrategies.repositories;
import tech.istrategies.models.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees, String>{

}
