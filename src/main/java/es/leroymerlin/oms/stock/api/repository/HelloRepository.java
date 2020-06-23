package es.leroymerlin.oms.stock.api.repository;

import es.leroymerlin.oms.stock.api.model.Hello;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends CrudRepository<Hello, String> {
}
