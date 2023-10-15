package br.com.jps.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository extends JpaRepository <UserModel, UUID> {
    UserModel findByUsername(String username);
}
