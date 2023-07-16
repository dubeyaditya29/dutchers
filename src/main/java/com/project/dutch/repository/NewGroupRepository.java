package com.project.dutch.repository;

import com.project.dutch.entity.NewGroup;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewGroupRepository extends MongoRepository<NewGroup,Integer> {
}
