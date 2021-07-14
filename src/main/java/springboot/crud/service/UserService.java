package springboot.crud.service;


import springboot.crud.model.Role;
import springboot.crud.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void createUser(User user);
    Iterable<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(User user);
    Optional<User> getUserById(Long id);
}
