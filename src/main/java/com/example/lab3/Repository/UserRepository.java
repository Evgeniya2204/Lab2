package com.example.lab3.Repository;

import com.example.lab3.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
