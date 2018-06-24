package tech.istrategies.repositories;

import org.springframework.data.repository.CrudRepository;

import tech.istrategies.models.Payments;

public interface PaymentRepository extends CrudRepository<Payments, Integer> {

}
