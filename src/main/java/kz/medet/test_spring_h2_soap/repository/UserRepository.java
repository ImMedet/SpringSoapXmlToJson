package kz.medet.test_spring_h2_soap.repository;

import kz.medet.test_spring_h2_soap.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
