package springboot.crud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.crud.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
