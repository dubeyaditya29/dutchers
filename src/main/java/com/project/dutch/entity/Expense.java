package com.project.dutch.entity;

import com.project.dutch.models.KindOfSplit;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@Document(value = "expense")
public class Expense {

    @Id
    private Integer expenseID;
    private String expenseDescription;
    private Double expenseAmount;
    private KindOfSplit TypeOfSplit;
    private Integer paidByUserID;
}
