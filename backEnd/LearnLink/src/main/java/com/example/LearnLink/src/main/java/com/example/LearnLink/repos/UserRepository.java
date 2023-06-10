package com.example.LearnLink.repos;

import com.example.LearnLink.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
