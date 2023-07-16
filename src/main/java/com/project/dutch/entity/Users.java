package com.project.dutch.entity;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(value = "users")
public class Users {
    @Id
    private Integer userID;
    private String userName;
}
