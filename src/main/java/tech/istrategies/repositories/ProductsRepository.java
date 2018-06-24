package tech.istrategies.repositories;

import org.springframework.data.repository.CrudRepository;

import tech.istrategies.models.Products;

public interface ProductsRepository extends CrudRepository<Products, Integer>{

}
