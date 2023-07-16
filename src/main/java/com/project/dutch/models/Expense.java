package com.project.dutch.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
public class Expense {

    @Id
    private Integer expenseID;
    private String expenseDescription;
    private Double expenseAmount;
    private KindOfSplit TypeOfSplit;
    private Integer paidByUserID;
}
