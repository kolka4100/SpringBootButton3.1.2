package springboot.crud.repos;

import org.springframework.data.repository.CrudRepository;
import springboot.crud.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String userName);
    User findByEmail(String email);
}
