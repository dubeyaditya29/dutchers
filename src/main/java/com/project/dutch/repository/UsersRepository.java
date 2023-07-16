package com.project.dutch.repository;

import com.project.dutch.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,Integer> {
}
