package com.project.dutch.repository;

import com.project.dutch.entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense,Integer> {
}
